
package arbol;


public class Nodo1 {
    public String dato;
    public Nodo1 NodoIzquierda;
    public Nodo1 NodoDerecha;
    public Nodo1 NodoDerecha2;
    
    public Nodo1(String dato) {
        this.dato = dato;
        this.NodoIzquierda = null;
        this.NodoDerecha = null;
        this.NodoDerecha2=null;
    }

    Nodo1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Nodo1 getNodoDerecha2() {
        return NodoDerecha2;
    }

    public void setNodoDerecha2(Nodo1 NodoDerecha2) {
        this.NodoDerecha2 = NodoDerecha2;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo1 getNodoIzquierda() {
        return NodoIzquierda;
    }

    public void setNodoIzquierda(Nodo1 NodoIzquierda) {
        this.NodoIzquierda = NodoIzquierda;
    }

    public Nodo1 getNodoDerecha() {
        return NodoDerecha;
    }

    public void setNodoDerecha(Nodo1 NodoDerecha) {
        this.NodoDerecha = NodoDerecha;
    }
    
}
