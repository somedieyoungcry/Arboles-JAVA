package arbol;

public class ArbolesBusquedas {

    public static void main(String[] args) {
        int contador = 0;
        // crear nodos
        NodoArbol raiz = new NodoArbol('J');

        // primer nivel
        NodoArbol nivel1hijo0 = new NodoArbol('K');
        NodoArbol nivel1hijo1 = new NodoArbol('D');
        NodoArbol nivel1hijo2 = new NodoArbol('M');

        // segundo nivel
        NodoArbol nivel2hijo0 = new NodoArbol('C');
        NodoArbol nivel2hijo1 = new NodoArbol('L');
        NodoArbol nivel2hijo2 = new NodoArbol('A');
        NodoArbol nivel2hijo3 = new NodoArbol('H');
        NodoArbol nivel2hijo4 = new NodoArbol('O');
        //NodoArbol nivel2hijo5 = new NodoArbol('e');

        // tercer nivel
        NodoArbol nivel3hijo0 = new NodoArbol('I');
        NodoArbol nivel3hijo1 = new NodoArbol('B');
        NodoArbol nivel3hijo2 = new NodoArbol('N');
        NodoArbol nivel3hijo3 = new NodoArbol('Q');
        NodoArbol nivel3hijo4 = new NodoArbol('R');
        NodoArbol nivel3hijo5 = new NodoArbol('G');

        // cuarto nivel
        NodoArbol nivel4hijo0 = new NodoArbol('F');
        NodoArbol nivel4hijo1 = new NodoArbol('P');
        NodoArbol nivel4hijo2 = new NodoArbol('E');// elemento a encontrar

        // construir el arbol
        raiz.addHijo(nivel1hijo0);
        raiz.addHijo(nivel1hijo1);
        raiz.addHijo(nivel1hijo2);

        // primer nivel
        nivel1hijo0.addHijo(nivel2hijo0);
        nivel1hijo1.addHijo(nivel2hijo1);
        nivel1hijo1.addHijo(nivel2hijo2);
        nivel1hijo1.addHijo(nivel2hijo3);
        nivel1hijo2.addHijo(nivel2hijo4);

        // segundo nivel
        nivel2hijo0.addHijo(nivel3hijo0);
        nivel2hijo0.addHijo(nivel3hijo1);
        nivel2hijo0.addHijo(nivel3hijo2);
        nivel2hijo1.addHijo(nivel3hijo3);
        nivel2hijo1.addHijo(nivel3hijo4);
        nivel2hijo2.addHijo(nivel3hijo5);

        // tercer nivel
        nivel3hijo1.addHijo(nivel4hijo0);
        nivel3hijo1.addHijo(nivel4hijo1);
        nivel3hijo3.addHijo(nivel4hijo2);

        System.out.println(raiz.busquedaProfundidad('E'));

        //sumaContador();
        /*
        // crear nodos
        NodoArbol raiz = new NodoArbol('v');

        // primer nivel
        NodoArbol nivel1hijo0 = new NodoArbol('i');
        NodoArbol nivel1hijo1 = new NodoArbol('o');
        NodoArbol nivel1hijo2 = new NodoArbol('r');

        // segundo nivel
        NodoArbol nivel2hijo0 = new NodoArbol('d');
        NodoArbol nivel2hijo1 = new NodoArbol('c');
        NodoArbol nivel2hijo2 = new NodoArbol('n');
        NodoArbol nivel2hijo3 = new NodoArbol('r');
        NodoArbol nivel2hijo4 = new NodoArbol('e');
        NodoArbol nivel2hijo5 = new NodoArbol('e');

        // tercer nivel
        NodoArbol nivel3hijo0 = new NodoArbol('a');
        NodoArbol nivel3hijo1 = new NodoArbol('s');
        NodoArbol nivel3hijo2 = new NodoArbol('c');
        NodoArbol nivel3hijo3 = new NodoArbol('u');
        NodoArbol nivel3hijo4 = new NodoArbol('n');
        NodoArbol nivel3hijo5 = new NodoArbol('t');
        NodoArbol nivel3hijo6 = new NodoArbol('s');

        // construir el arbol
        raiz.addHijo(nivel1hijo0);
        raiz.addHijo(nivel1hijo1);
        raiz.addHijo(nivel1hijo2);

        // primer nivel
        nivel1hijo0.addHijo(nivel2hijo0);
        nivel1hijo0.addHijo(nivel2hijo1);
        nivel1hijo1.addHijo(nivel2hijo2);
        nivel1hijo2.addHijo(nivel2hijo3);
        nivel1hijo2.addHijo(nivel2hijo4);
        nivel1hijo2.addHijo(nivel2hijo5);

        // segundo nivel
        nivel2hijo0.addHijo(nivel3hijo0);
        nivel2hijo0.addHijo(nivel3hijo1);
        nivel2hijo2.addHijo(nivel3hijo2);
        nivel2hijo2.addHijo(nivel3hijo3);
        nivel2hijo4.addHijo(nivel3hijo4);
        nivel2hijo4.addHijo(nivel3hijo5);
        nivel2hijo5.addHijo(nivel3hijo6);
         */
        //System.out.println(raiz.busquedaAnchura('u'));
    }
}
