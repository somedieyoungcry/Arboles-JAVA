package AVL;

import Basic.*;

public class ArbolAVL {

    Nodo Raiz;

    public ArbolAVL() {
        this.Raiz = null;
    }

    public boolean esVacioAVL() {
        return esVacio(this.Raiz);
    }

    public boolean esVacio(Nodo R) {
        if (R == null) {
            return true;
        } else {
            return false;
        }
    }

    public void Inserta(Informacion elemento) {
        this.Raiz = InsertaRec(this.Raiz, elemento);

    }

    public Nodo InsertaRec(Nodo R, Informacion elemento) {
        int Rde, Rdi;
        if (esVacio(R)) {
            R = new Nodo(elemento);
        } else {
            if (elemento.getX() <= R.getElem().getX()) {
                R.setHIzq(InsertaRec(R.getHIzq(), elemento));
                Rde = VerificaRDer(R, elemento);
                if (Rde > 0) {
                    if (Rde == 1) {
                        R = RSimpleDerecha(R);
                    } else {
                        R = RDobleDerecha(R);
                    }
                }

            } else {
                R.setHDer(InsertaRec(R.getHDer(), elemento));
                Rdi = VerificaRIzq(R, elemento);
                if (Rdi > 0) {
                    if (Rdi == 1) {
                        R = RSimpleIzquierda(R);
                    } else {
                        R = RDobleIzquierda(R);
                    }
                }
            }
        }
        return R;
    }

    public void preOrden() {
        preOrdenRec(this.Raiz);
        System.out.println("");
    }

    public void preOrdenRec(Nodo R) {
        if (!esVacio(R)) {
            System.out.print(R.getElem().getX() + ",");
            preOrdenRec(R.getHIzq());
            preOrdenRec(R.getHDer());
        }
    }

    public void enOrden() {
        enOrdenRec(this.Raiz);
        System.out.println("");
    }

    public void enOrdenRec(Nodo R) {
        if (!esVacio(R)) {
            enOrdenRec(R.getHIzq());
            System.out.print(R.getElem().getX() + ",");
            enOrdenRec(R.getHDer());
        }
    }

    public void postOrden() {
        postOrdenRec(this.Raiz);
        System.out.println("");
    }

    public void postOrdenRec(Nodo R) {
        if (!esVacio(R)) {
            postOrdenRec(R.getHIzq());
            postOrdenRec(R.getHDer());
            System.out.print(R.getElem().getX() + ",");

        }
    }

    public Nodo Busca(Informacion elemento) {
        return BuscaRec(this.Raiz, elemento);
    }

    public Nodo BuscaRec(Nodo R, Informacion elemento) {
        Nodo aux = null;
        if (!esVacio(R)) {
            if (elemento.getX() == R.getElem().getX()) {
                aux = R;
            } else {
                if (elemento.getX() <= R.getElem().getX()) {
                    aux = BuscaRec(R.getHIzq(), elemento);
                } else {
                    aux = BuscaRec(R.getHDer(), elemento);
                }
            }
        }
        return aux;
    }

    public Nodo buscaMinimo() {
        return buscaMinimoR(this.Raiz);
    }

    public Nodo buscaMinimoR(Nodo R) {
        Nodo aux = null;
        if (!esVacio(R)) {
            if (R.getHIzq() == null) {
                aux = R;
            } else {
                aux = buscaMinimoR(R.getHIzq());
            }
        }
        return aux;
    }

    public Nodo buscaMax() {
        return buscaMaxR(this.Raiz);
    }

    public Nodo buscaMaxR(Nodo R) {
        Nodo aux = null;
        if (!esVacio(R)) {
            if (R.getHDer() == null) {
                aux = R;
            } else {
                aux = buscaMaxR(R.getHDer());
            }
        }
        return aux;
    }

    public void eliminaRecB(Informacion elemento) {
        this.Raiz = eliminaRec(this.Raiz, elemento);

    }

    public Nodo eliminaRec(Nodo R, Informacion elemento) {
        Nodo aux;
        int RIzq, RDer;
        if (!esVacio(R)) {
            //El codigo de las lineas 153, 157: me invoca la llamada recursiva para buscar el elmento
            if (elemento.getX() < R.getElem().getX()) {
                R.setHIzq(eliminaRec(R.getHIzq(), elemento));
                RIzq = VerficacionRIzquierda(R);
                if (RIzq > 0) {
                    if (RIzq == 1) {
                        R = RSimpleIzquierda(R);
                    } else {
                        R = RDobleIzquierda(R);
                    }
                }
            } else {
                if (elemento.getX() > R.getElem().getX()) {
                    R.setHDer(eliminaRec(R.getHDer(), elemento));
                    RDer = VerficacionRDerecha(R);
                    if (RDer > 0) {
                        if (RDer == 1) {
                            R = RSimpleDerecha(R);
                        } else {
                            R = RDobleDerecha(R);
                        }
                    }
                } else {
                    //Eliminacion del elemento 
                    aux = R;
                    //Eliminacion tipo 2
                    if (R.getHIzq() == null) {
                        R = R.getHDer();
                        aux = null;
                    } else {
                        if (R.getHDer() == null) {
                            R = R.getHIzq();
                            aux = null;
                        } else {
                            //Eliminacion tipo 3
                            aux = buscaMaxR(R.getHIzq());//Busca mayor de los menores
                            R.setElem(aux.getElem()); //Sustituye el elemento
                            R.setHIzq(eliminaRec(R.getHIzq(), aux.getElem())); //Eliminacion(en el subIzq) del elemento obtenido
                            RIzq = VerficacionRIzquierda(R);
                            if (RIzq > 0) {
                                if (RIzq == 1) {
                                    R = RSimpleIzquierda(R);
                                } else {
                                    R = RDobleIzquierda(R);
                                }
                            }
                        }
                    }
                }
            }
        }
        return R;
    }

    public int CuentaNodos(ArbolAVL A) {
        return CuentaNodosRec(A.Raiz);
    }

    public static int CuentaNodosRec(Nodo R) {
        int nIzq, nDer, total;
        nIzq = 0;
        nDer = 0;
        if (R == null) { // Condición de paro de llamada recursiva
            total = 0;
        } else { // Llamadas recursivas
            nIzq = CuentaNodosRec(R.getHIzq());
            nDer = CuentaNodosRec(R.getHDer());
            total = nIzq + nDer + 1;
        }
        return total;
    }

    public int Maximo(int a, int b) {
        int max = 0;
        if (a >= b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public int Altura() {
        int altura;
        if (esVacioAVL()) {
            altura = 0;
        } else {
            altura = AlturaRec(this.Raiz);
        }
        return altura;
    }

    public int AlturaRec(Nodo R) {
        int altura, alturaIzq, alturaDer;
        // Primer caso: Cuando el árbol está vacío tiene altura?
        if (esVacio(R)) {
            altura = 0;
        } else {
            alturaIzq = AlturaRec(R.getHIzq());
            alturaDer = AlturaRec(R.getHDer());
            /* Una vez calculadas las alturas del subárbol izquierdo y derecho deben de quedarse con la
               altura máxima de ellas. Imaginen que estamos en la raíz del árbol y que tengo 2 niveles de
               nodos por debajo de ella. Entonces si contemplo a la raíz, el árbol debe de tener altura 
               3. Por lo cual, hace falta sumar una cantidad indicada. ¿Cuál es? */
            altura = Maximo(alturaDer, alturaIzq) + 1;
        }
        return altura;
    }

    public int Desequilibrio(Nodo R) {
        int des;
        des = AlturaRec(R.getHIzq()) - AlturaRec(R.getHDer()); //AlturaSubI - AlturaSubD
        if (des < 0) { //Aqui se juega el rol del valor absoluto
            des = des * (-1);
        }
        return des;
    }

    public Nodo RSimpleIzquierda(Nodo R) {
        Nodo aux;
        aux = R.getHDer();
        R.setHDer(aux.getHIzq());
        aux.setHIzq(R);
        R = aux;
        return R;
    }

    public Nodo RSimpleDerecha(Nodo R) {
        Nodo aux;
        aux = R.getHIzq();
        R.setHIzq(aux.getHDer());
        aux.setHDer(R);
        R = aux;
        return R;
    }

    public Nodo RDobleIzquierda(Nodo R) {
        R.setHDer(RSimpleDerecha(R.getHDer()));
        R = RSimpleIzquierda(R);

        return R;
    }

    public Nodo RDobleDerecha(Nodo R) {
        R.setHIzq(RSimpleIzquierda(R.getHIzq()));
        R = RSimpleDerecha(R);
        return R;
    }

    public int VerificaRDer(Nodo R, Informacion elem) {
        int flag = 0;
        if (Desequilibrio(R) == 2) {
            if (elem.getX() <= R.getElem().getX()) {
                if (elem.getX() <= R.getHIzq().getElem().getX()) {
                    flag = 1;//Rotacion simple a la izquierda
                } else {
                    flag = 2;//rotacion doble a la izquierda
                }
            }
        }
        return flag;
    }

    public int VerificaRIzq(Nodo R, Informacion elem) {
        int flag = 0;
        if (Desequilibrio(R) == 2) {
            if (elem.getX() >= R.getElem().getX()) {
                if (elem.getX() >= R.getHDer().getElem().getX()) {
                    flag = 1;
                } else {
                    flag = 2;
                }
            }
        }
        return flag;
    }

    public int VerficacionRIzquierda(Nodo R) {
        int rotacion = 0;
        if (Desequilibrio(R) == 2) {
            if (AlturaRec(R.getHDer().getHIzq()) <= AlturaRec(R.getHDer().getHDer())) {
                rotacion = 1; //RSI
            } else {
                rotacion = 2; //RSD
            }
        }
        return rotacion;
    }

    public int VerficacionRDerecha(Nodo R) {
        int rotacion = 0;
        if (Desequilibrio(R) == 2) {
            if (AlturaRec(R.getHIzq().getHIzq()) >= AlturaRec(R.getHIzq().getHDer())) {
                rotacion = 1;
            } else {
                rotacion = 2;
            }
        }
        return rotacion;
    }
}
