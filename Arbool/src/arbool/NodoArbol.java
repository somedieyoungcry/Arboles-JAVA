package arbool;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class NodoArbol {

    private char elem;
    private List<NodoArbol> hijos;

    public NodoArbol(char elemento) {
        this.elem = elemento;
        hijos = new ArrayList<NodoArbol>();
    }

    public char getElemento() {
        return elem;
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

    public String busquedaAnchura(char c) {
        Queue<NodoArbol> colaAuxiliar = new LinkedList<NodoArbol>();
        colaAuxiliar.add(this);

        while (colaAuxiliar.size() != 0) {
            NodoArbol cabeza = colaAuxiliar.poll();
            System.out.println(cabeza.getElemento());  
            if (cabeza.getElemento() == c) {
                return " encontrada ";
            } else {
                for (NodoArbol hijo : cabeza.getHijos()) {
                    colaAuxiliar.add(hijo);
                }
            }
        }
        return " No encontrada ";
    }
    
    public String busquedaProfundidad(char c) {
	   Stack<NodoArbol> pilaAuxiliar = new Stack<NodoArbol>();
	   pilaAuxiliar.push(this);
	 
	   while(pilaAuxiliar.size() != 0) {
	      NodoArbol cabeza = pilaAuxiliar.pop();
	      System.out.println(cabeza.getElemento()); 
	      if(cabeza.getElemento() == c)
	         return "Se encotro la ruta";
	      else
	         for(int i = cabeza.getHijos().size() - 1; i >= 0; i--)
	            pilaAuxiliar.push(cabeza.getHijos().get(i));
	   }
	   return "No se encontro";
	}


}
