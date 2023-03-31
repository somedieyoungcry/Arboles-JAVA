package paquete;

public class Arbol {
    Cola Cola = new Cola();
	NodoBinario Padre;
	NodoBinario Raiz;
 
	//Constructor
	public Arbol(){
		Raiz = null;
	}
 
	//Insercion de un elemento en el arbol
	public void InsertaNodo(int Elem, String nombre){
		if(Raiz == null)
			Raiz = new NodoBinario (Elem, nombre);
		else
			Raiz.InsertaBinario (Elem, nombre);
	}
 
	//Preorden Recursivo del arbol
	public void Preorden (NodoBinario Nodo){
		if(Nodo == null)
			return;
		else{
			//System.out.print (Nodo.dato + " ");
                        System.out.print(Nodo.nombre + " ");
			Preorden (Nodo.Hizq);
			Preorden (Nodo.Hder);
		}
	}
 
	//PostOrden recursivo del arbol
	public void PostOrden (NodoBinario Nodo){
		if(Nodo == null)
			return;
		else{
			PostOrden (Nodo.Hizq);
			PostOrden (Nodo.Hder);
			System.out.print (Nodo.dato + " ");
		}
	}
 
	//Inorden Recursivo del arbol
	public void Inorden (NodoBinario Nodo){
		if(Nodo == null)
			return;
		else{
			Inorden (Nodo.Hizq);
			System.out.print(Nodo.dato + " ");
			Inorden (Nodo.Hder);
		}
	}
 
	//Busca un elemento en el arbol
	void Busqueda (int Elem, NodoBinario A){
		if((A == null) | (A.dato == Elem)){
			System.out.print(A.dato + " ");
			return;
		}
		else{
			if(Elem>A.dato)
				Busqueda (Elem, A.Hder);
			else
				Busqueda ( Elem, A.Hizq);
		}
	}
 
	//Altura del arbol
	public int Altura (NodoBinario Nodo){
		int Altder = (Nodo.Hder == null? 0:1 + Altura (Nodo.Hder));
		int Altizq = (Nodo.Hizq == null? 0:1 + Altura (Nodo.Hizq));
		return Math.max(Altder,Altizq);
	}
 
	//Recorrido en anchura del arbol
	public void Anchura (NodoBinario Nodo, NodoBinario meta){
		Cola cola= new Cola();
		NodoBinario T = null;
                NodoBinario S = null;
		System.out.print ("El recorrido en Anchura es: ");
		if(Nodo != null){
			cola.InsertaFinal (Nodo);
			while(!(cola.VaciaLista ()) || T.dato==meta.dato){
				T = cola.PrimerNodo.datos;
				cola.EliminaInicio();
				//System.out.print(T.dato + " " + " Nombre:" + T.nombre);
                                //if(T.dato==meta){}
                                System.out.print(T.nombre + " ");
				if (T.Hizq != null)
					cola.InsertaFinal (T.Hizq);
				if (T.Hder != null)
					cola.InsertaFinal (T.Hder);
                                
                               if (T.dato==meta.dato) 
                                return;
                            
			}
		}
		System.out.println();
	}
}
