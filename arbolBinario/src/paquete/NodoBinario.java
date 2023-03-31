
package paquete;
import java.io.*;
public class NodoBinario {
    int dato;
    String nombre;
	NodoBinario Hizq, Hder;
	//Constructores
	NodoBinario (int Elem, String nom){
		dato = Elem;
                this.nombre=nom;
		NodoBinario Hizq, Hder = null;
	}
 
	//Insercion de un elemento
	public void InsertaBinario (int Elem, String nombre){
		if(Elem < dato){
			if (Hizq == null)
				Hizq = new NodoBinario(Elem,nombre);
			else
				Hizq.InsertaBinario(Elem,nombre);
		}
		else{
			if (Elem > dato){
				if (Hder == null)
					Hder = new NodoBinario (Elem,nombre);
				else
					Hder.InsertaBinario(Elem,nombre);
			}
		}
	}
}
