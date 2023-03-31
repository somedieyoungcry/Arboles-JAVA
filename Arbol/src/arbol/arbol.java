package arbol;

import java.util.ArrayList;

public class arbol {

    public static void main(String[] args) {
        Nodo1 raiz = new Nodo1("[A]");
        Nodo1 nodo2 = new Nodo1("[D]");
        Nodo1 nodo3 = new Nodo1("[F]");
        Nodo1 nodo4 = new Nodo1("[G]");

        raiz.setNodoIzquierda(nodo2);//sub arbol
        Nodo1 nodo5 = new Nodo1("[H]");//subarbol
        nodo2.setNodoIzquierda(nodo5);
        nodo5.setNodoDerecha(new Nodo1("[B]"));//este nodo lo tenemos que encontrar es salida / hoja 

        Nodo1 nodo6 = new Nodo1("[J]");//sub arbol
        nodo2.setNodoDerecha(nodo6);
        Nodo1 nodo7 = new Nodo1("[K]");
        nodo6.setNodoDerecha(nodo7);
        nodo7.setNodoIzquierda(new Nodo1("[L]"));//este nodo lo tenemos que encontrar / hoja

        raiz.setNodoDerecha(nodo3);//sub arbol
        nodo3.setNodoIzquierda(new Nodo1("[C]"));// hoja

        Nodo1 nodo8 = new Nodo1("[E]");
        nodo3.setNodoDerecha(nodo8);
        nodo8.setNodoIzquierda(new Nodo1("[Z]"));// hoja
        nodo8.setNodoDerecha(new Nodo1("[W]"));// hoja

        System.out.println("preOrden");
        raiz.setNodoDerecha2(nodo4);//sub arbol nuevo

        preOrden(raiz);

       
    }

    public static void preOrden(Nodo1 raiz) {
        if (raiz != null) {
            System.out.println(raiz.getDato());
            preOrden(raiz.getNodoIzquierda());
            preOrden(raiz.getNodoDerecha());
            preOrden(raiz.getNodoDerecha2());
        }
    }
    /*private boolean[] BA = new boolean[5];

    public ArrayList<Integer> recorridoAnchura(int nodoI) {
        ArrayList<Integer> recorridos = new ArrayList<Integer>();
        BA[nodoI] = true;
        ArrayList<Integer> cola = new ArrayList<Integer>();
        recorridos.add(nodoI);
        cola.add(nodoI);
        while (!cola.isEmpty()) {
            int j = cola.remove(0);
            for (int i = 0; i < n.length; i++) {
                if (n[j][i] == 1 && !BA[i]) {
                    cola.add(i);
                    recorridos.add(i);
                    BA[i] = true;
                }
            }
        }
        return recorridos;
    }*/

}
