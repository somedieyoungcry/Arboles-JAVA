package arbol;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class NodoArbol {

    private char elemento;
    private List<NodoArbol> hijos;

    public NodoArbol(char elemento) {
        this.elemento = elemento;
        hijos = new ArrayList<NodoArbol>();
    }

    public char getElemento() {
        return elemento;
    }

    public void addHijo(NodoArbol hijo) {
        hijos.add(hijo);
    }

    public List<NodoArbol> getHijos() {
        return hijos;
    }

    public boolean esNodoHoja() {
        return hijos.size() > 0;
    }

    public boolean busquedaAnchura(char c) {
        Queue<NodoArbol> colaAuxiliar = new LinkedList<NodoArbol>();
        colaAuxiliar.add(this);

        while (colaAuxiliar.size() != 0) {
            NodoArbol cabeza = colaAuxiliar.poll();
            System.out.println(cabeza.getElemento());  // solo añadido como informacion para nosotros
            if (cabeza.getElemento() == c) {
                return true;
            } else {
                for (NodoArbol hijo : cabeza.getHijos()) {
                    colaAuxiliar.add(hijo);
                }
            }
        }
        return false;
    }

    public boolean busquedaProfundidad(char c) {
        int contador = 0;
        Stack<NodoArbol> pilaAuxiliar = new Stack<NodoArbol>();
        pilaAuxiliar.push(this);
        System.out.println("La ruta es la siguiente");
        while (pilaAuxiliar.size() != 0) {
            NodoArbol cabeza = pilaAuxiliar.pop();
            if (cabeza.getElemento() == 'J') {   
            }
            if (cabeza.getElemento() == 'K') {
                contador += 2;
            }
            if (cabeza.getElemento() == 'D') {
                contador += 5;
            }
            if (cabeza.getElemento() == 'M') {
                contador += 1;
            }
            if (cabeza.getElemento() == 'C') {
                contador += 6;
            }
            if (cabeza.getElemento() == 'L') {
                contador += 3;
            }
            if (cabeza.getElemento() == 'A') {
                contador += 1;
            }
            if (cabeza.getElemento()== 'H') {
                contador+=2;
            }
            if (cabeza.getElemento()=='O') {
                contador+=10;
            }
            if (cabeza.getElemento()=='I') {
                contador+=4;
            }
            if (cabeza.getElemento()=='B') {
                contador+=3;
            }
            if (cabeza.getElemento()=='N') {
                contador+=2;
            }
            if (cabeza.getElemento()=='Q') {
                contador+=5;
            }
            if (cabeza.getElemento()=='R') {
                contador+=3;
            }
            if (cabeza.getElemento()=='G') {
                contador+=20;
            }
            if (cabeza.getElemento()=='F') {
                contador+=8;
            }
            if (cabeza.getElemento()=='P') {
                contador+=6;
            }
            if (cabeza.getElemento()=='E') {
                contador+=1;
            }
            System.out.print(cabeza.getElemento()+" -> ");  // solo añadido como informacion para nosotros

            if (cabeza.getElemento() == c) {
                System.out.println("");
                System.out.println("Con un valor coste de: " + contador);
                return true;
            } else {
                for (int i = cabeza.getHijos().size() - 1; i >= 0; i--) {
                    pilaAuxiliar.push(cabeza.getHijos().get(i));
                }
            }
        }
        return false;
    }
}
/*if (cabeza.getElemento() == 'J') {
                if (cabeza.getElemento() == ('K')) {
                    contador += 2;
                }
                if (cabeza.getElemento() == 'D') {
                    contador += 5;
                }if (cabeza.getElemento() == 'M') {
                    contador += 1;
                }if (cabeza.getElemento() == 'C') {
                    contador += 6;
                } if (cabeza.getElemento() == 'L') {
                    contador += 3;
                }if (cabeza.getElemento() == 'A') {
                    contador += 1;
                }
}*/
 /*public boolean busquedaProfundidad(char c) {
        int contador = 0;
        Stack<NodoArbol> pilaAuxiliar = new Stack<NodoArbol>();
        pilaAuxiliar.push(this);
        while (pilaAuxiliar.size() != 0) {
            NodoArbol cabeza = pilaAuxiliar.pop();
            System.out.println(cabeza.getElemento());  // solo añadido como informacion para nosotros
                if (cabeza.getElemento() == c) {
                    return true;
                } else {
                    for (int i = cabeza.getHijos().size() - 1; i >= 0; i--) {
                        pilaAuxiliar.push(cabeza.getHijos().get(i));
                    }
                }                
            }
        return false;
        }
    }*/
