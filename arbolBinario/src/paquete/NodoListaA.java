package paquete;

public class NodoListaA {

    NodoBinario datos;
    NodoListaA siguiente;

    //Construtor  Crea un nodo del tipo Object
    NodoListaA(NodoBinario valor) {
        datos = valor;
        siguiente = null;  //siguiente con valor de nulo
    }

    // Constructor Crea un nodo del Tipo Object y al siguiente nodo de la lista
    NodoListaA(NodoBinario valor, NodoListaA signodo) {
        datos = valor;
        siguiente = signodo; //siguiente se refiere al siguiente nodo
    }
}
