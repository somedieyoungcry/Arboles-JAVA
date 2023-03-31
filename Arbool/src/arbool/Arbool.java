package arbool;

public class Arbool {

    public static void main(String[] args) {
        // raiz
        NodoArbol ar = new NodoArbol('j');
        // primero
        NodoArbol n1K = new NodoArbol('k');
        NodoArbol n1D = new NodoArbol('d');
        NodoArbol n1M = new NodoArbol('m');
        // segundo 
        NodoArbol n2C = new NodoArbol('c');
        NodoArbol n2L = new NodoArbol('l');
        NodoArbol n2A = new NodoArbol('a');
        NodoArbol n2H = new NodoArbol('h');
        NodoArbol n2O = new NodoArbol('o');

        // tercero
        NodoArbol n3I = new NodoArbol('i');
        NodoArbol n3B = new NodoArbol('b');
        NodoArbol n3N = new NodoArbol('n');
        NodoArbol n3Q = new NodoArbol('q');
        NodoArbol n3R = new NodoArbol('r');
        NodoArbol n3G = new NodoArbol('g');

        //cuarto
        NodoArbol n4F = new NodoArbol('f');
        NodoArbol n4P = new NodoArbol('p');
        NodoArbol n4E = new NodoArbol('e');

        // primeros
        ar.addHijo(n1K);
        ar.addHijo(n1D); 
        ar.addHijo(n1M); 

        n1K.addHijo(n2C); 
        n2C.addHijo(n3I); 
        n2C.addHijo(n3B);
        n3B.addHijo(n4F);
        n3B.addHijo(n4P);
        n2C.addHijo(n3N);

        n1D.addHijo(n2L);
        n2L.addHijo(n3Q);
        n3Q.addHijo(n4E);
        n2L.addHijo(n3R);
        n1D.addHijo(n2A);
        n2A.addHijo(n3G);
        n1D.addHijo(n2H);

        n1M.addHijo(n2O);
        
        /*NodoArbol ar = new NodoArbol('J');
        NodoArbol a1 = new NodoArbol('K');
        NodoArbol a2 = new NodoArbol('C');
        NodoArbol a3 = new NodoArbol('I');
        NodoArbol a4 = new NodoArbol('B');
        NodoArbol a5 = new NodoArbol('N');
        NodoArbol a6 = new NodoArbol('F');
        NodoArbol a7 = new NodoArbol('P');
        
        NodoArbol b1 = new NodoArbol('D');
        NodoArbol b2 = new NodoArbol('L');
        NodoArbol b3 = new NodoArbol('A');
        NodoArbol b4 = new NodoArbol('H');
        NodoArbol b5 = new NodoArbol('Q');
        NodoArbol b6 = new NodoArbol('R');
        NodoArbol b7 = new NodoArbol('G');
        NodoArbol b8 = new NodoArbol('E');
        
        NodoArbol c1 = new NodoArbol('M');
        NodoArbol c2 = new NodoArbol('O');
        
        ar.addHijo(a1);
        ar.addHijo(b1);
        ar.addHijo(c1);*/

        //System.out.println(ar.busquedaAnchura('v'));
        //System.out.println(ar.busquedaAnchura('u'));
        //System.out.println(ar.busquedaAnchura('b'));
        System.out.println(ar.busquedaProfundidad('e'));
        //System.out.println(ar.busquedaProfundidad('r'));
        //System.out.println(ar.busquedaProfundidad('x'));
    }
}
