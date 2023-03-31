package ABB;

import Basic.*;

public class ArbolBB {

    Nodo raiz;

    public ArbolBB() {
        this.raiz = null;
    }

    public boolean EsVacioABB() {
        return EsVacio(this.raiz);
    }

    public boolean EsVacio(Nodo R) {
        if (R == null) {
            return true;
        } else {
            return false;
        }
    }

    public void Inserta(Informacion elemento) {
        this.raiz = InsertaRec(this.raiz, elemento);
    }

    public Nodo InsertaRec(Nodo R, Informacion elemento) {
        if (EsVacio(R)) {
            R = new Nodo(elemento);
        } else {
            if (elemento.getX() <= R.getElem().getX()) {
                R.setHIzq(InsertaRec(R.getHIzq(), elemento));
            } else {
                R.setHDer(InsertaRec(R.getHDer(), elemento));
            }
        }
        return R;
    }

    public void Preorden() {
        PreordenRec(this.raiz);
        System.out.println("");
    }

    public void PreordenRec(Nodo R) {
        if (!EsVacio(R)) {
            System.out.print(R.getElem().getX() + ", ");
            PreordenRec(R.getHIzq());
            PreordenRec(R.getHDer());
        }
    }

    public void Inorden() {
        InordenRec(this.raiz);
        System.out.println("");
    }

    public void InordenRec(Nodo R) {
        if (!EsVacio(R)) {
            InordenRec(R.getHIzq());
            System.out.print(R.getElem().getX() + ", ");
            InordenRec(R.getHDer());
        }
    }

    public void Postorden() {
        PostordenRec(this.raiz);
        System.out.println("");
    }

    public void PostordenRec(Nodo R) {
        if (!EsVacio(R)) {
            PostordenRec(R.getHIzq());
            PostordenRec(R.getHDer());
            System.out.print(R.getElem().getX() + ", ");
        }
    }

    public Nodo Busca(Informacion elemento) {
        return BuscaRec(this.raiz, elemento);
    }

    public Nodo BuscaRec(Nodo R, Informacion elemento) {
        Nodo aux = null;
        if (!EsVacio(R)) {
            if (elemento.getX() == R.getElem().getX()) {
                aux = R; //elemento buscado esta aqui
            } else {
                if (elemento.getX() <= R.getElem().getX()) {
                    aux = BuscaRec(R.getHIzq(), elemento);
                } else {
                    aux = BuscaRec(R.getHDer(), elemento);////moverme a la derecha
                }
            }
        }
        return aux;
    }

    public Nodo BuscaMinimo() {
        return BuscaMinimoRec(this.raiz);
    }

    public Nodo BuscaMinimoRec(Nodo R) {
        Nodo aux = null;
        if (!EsVacio(R)) {
            if (R.getHIzq() == null) {
                aux = R;
            } else {
                aux = BuscaMinimoRec(R.getHIzq());
            }
        }
        return aux;
    }

    public Nodo buscaMax() {
        return buscaMaxR(this.raiz);
    }

    public Nodo buscaMaxR(Nodo R) {
        Nodo aux = null;
        if (!EsVacio(R)) {
            if (R.getHDer() == null) {
                aux = R;
            } else {
                aux = buscaMaxR(R.getHDer());
            }
        }
        return aux;
    }

    public Nodo EliminaRec(Nodo R, Informacion elemento) {
        Nodo aux;
        if (!EsVacio(R)) {
            //Hace la llamada recursiva para buscar al elemento
            if (elemento.getX() < R.getElem().getX()) {
                R.setHIzq(EliminaRec(R.getHIzq(), elemento));
            } else {
                if (elemento.getX() > R.getElem().getX()) {
                    R.setHDer(EliminaRec(R.getHDer(), elemento));
                } else {
                    //A continuacion la eliminacion
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
                            //Eliminacion tiopo 3
                            aux = buscaMaxR(R.getHIzq());
                            R.setElem(aux.getElem());//Paso 2: sustitucion
                            R.setHIzq(EliminaRec(R.getHIzq(), aux.getElem()));
                        }
                    }
                }
            }
        }
        return R;
    }

    /*public Nodo eliminaRecB(Informacion elemento) {
        return EliminaRec(this.raiz, elemento);
    }*/
    public void Elimina(Informacion elemento){
        this.raiz = EliminaRec(this.raiz, elemento);
    }
    public int CuentaNodos(ArbolBB A){
        return CuentaNodosRec(A.raiz);
    }
    
    public int CuentaNodosRec(Nodo R){
        int nIzq, nDer, total;
        nIzq = 0; nDer =0;
        if(R == null){
            total = 0;
        } else{
            nIzq = CuentaNodosRec(R.getHIzq());
            nDer = CuentaNodosRec(R.getHDer());
            total = nIzq + nDer + 1;
        }
        return total;
    }
}
