
package arbol;

public class ArbolNarios {
    /* public void eliminarNodo(int valor) //funcion para árbol binario
  {
      Nodo pivote = raiz;
      Nodo tmp, nodoModificar, previo = null;
      
      //Inicia la busqueda del nodo a eliminar
      while(pivote != null && pivote.valor != valor)
      {
          previo = pivote;
          if(pivote.valor < valor)
              pivote = pivote.derecho;
          else
              pivote = pivote.izquierdo;
      }
      nodoModificar = pivote;
      
      if(pivote != null)//Si se encontro el nodo
      {
          if(nodoModificar.derecho == null)
              nodoModificar = nodoModificar.izquierdo;
          else if(nodoModificar.izquierdo == null)
              nodoModificar = nodoModificar.derecho;
          else //Tiene dos hijos
          {
              tmp = nodoModificar.izquierdo;
              while(tmp.derecho != null)              
                  tmp = tmp.derecho;
              tmp.derecho = nodoModificar.derecho;
              nodoModificar = nodoModificar.izquierdo;
          }
          if (pivote == raiz)
              raiz = nodoModificar;
          else if(previo.izquierdo == pivote)
              previo.izquierdo = nodoModificar;
          else previo.derecho = nodoModificar;
      }     
  }*/
}
