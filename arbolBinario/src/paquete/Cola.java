/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author xochi
 */
public class Cola {

    NodoListaA PrimerNodo;
    NodoListaA UltimoNodo;
    String Nombre;

    //Constructor construye una lista vacia con un nombre de List
    public Cola() {
        this("Lista");
    }

    //Constructor
    public Cola(String s) {
        Nombre = s;
        PrimerNodo = UltimoNodo = null;
    }

    //Retorna True si Lista Vacía
    public boolean VaciaLista() {
        return PrimerNodo == null;
    }

    //Inserta un Elemento al Frente de la Lista
    public void InsertaInicio(NodoBinario ElemInser) {
        if (VaciaLista()) {
            PrimerNodo = UltimoNodo = new NodoListaA(ElemInser);
        } else {
            PrimerNodo = new NodoListaA(ElemInser, PrimerNodo);
        }
    }

    //Inserta al Final de la Lista
    public void InsertaFinal(NodoBinario ElemInser) {
        if (VaciaLista()) {
            PrimerNodo = UltimoNodo = new NodoListaA(ElemInser);
        } else {
            UltimoNodo = UltimoNodo.siguiente = new NodoListaA(ElemInser);
        }
    }

    //Eliminar al Inicio
    public void EliminaInicio() {
        if (VaciaLista()) {
            System.out.println("No hay elementos");
        }

        // Restablecer  las referencias de PrimerNodo y UltimoNodo
        if (PrimerNodo.equals(UltimoNodo)) {
            PrimerNodo = UltimoNodo = null;
        } else {
            PrimerNodo = PrimerNodo.siguiente;
        }
    }

    //Elimina al final
    public void EliminaFinal() {
        if (VaciaLista()) {
            System.out.println("No hay elementos");
        }

        // Restablecer  las referencias de PrimerNodo y UltimoNodo
        if (PrimerNodo.equals(UltimoNodo)) {
            PrimerNodo = UltimoNodo = null;
        } else {
            NodoListaA Actual = PrimerNodo;
            while (Actual.siguiente != UltimoNodo) {
                Actual = Actual.siguiente;
            }

            UltimoNodo = Actual;
            Actual.siguiente = null;
        }
    }
}
