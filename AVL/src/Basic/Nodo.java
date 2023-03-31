package Basic;

public class Nodo {
    Informacion elem;
    Nodo HIzq;
    Nodo HDer;

    public Nodo(Informacion elemento) {
        this.elem = elemento;
        this.HIzq = null;
        this.HDer = null;
    }

    public Informacion getElem() {
        return elem;
    }

    public Nodo getHIzq() {
        return HIzq;
    }

    public Nodo getHDer() {
        return HDer;
    }

    public void setElem(Informacion elemento) {
        this.elem = elemento;
    }

    public void setHIzq(Nodo Hizq) {
        this.HIzq = Hizq;
    }

    public void setHDer(Nodo HDer) {
        this.HDer = HDer;
    }
    
    
}
