/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArbolBinarioA {

    public static void main(String[] args) throws IOException {
        Arbol A = new Arbol();

        String dato;
        int indice;
        int opc = 0;

        InputStreamReader en = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(en);
        System.out.println("Arbol Binario");
        do {

            System.out.println("MENU\n");
            System.out.println("Ingrese una opcion");
            System.out.println("1.Insertar");
            System.out.println("2.Eliminar");
            System.out.println("3.Recorrido en Pre orden");
            System.out.println("4.Recorrido en In orden");
            System.out.println("5.Recorrido en Pos orden");
            System.out.println("6.Salir");
            String decide = br.readLine();
            opc = Integer.parseInt(decide);
            switch (opc) {
                case 1:
                    System.out.println("Ingrese un numero\n");
                    dato = br.readLine();
                    int p = Integer.parseInt(dato);
                    System.out.println("Ingrese un nombre");
                    String nombre = br.readLine();
                    A.InsertaNodo(p, nombre);
                    break;
                case 2:
                    // 	System.out.println("Dame el numero a borrar\n");
                    // 	String g=br.readLine();
                    // 	indice=Integer.parseInt(g);
                    // 	A.Busqueda(indice);
                    break;
                case 3:
                    System.out.print("El recorrido en Preorden es: ");
                    A.Preorden(A.Raiz);
                    System.out.println();

                    break;
                case 4:
                    System.out.print("El recorrido en Inorden es: ");
                    A.Inorden(A.Raiz);
                    System.out.println();

                    break;
                case 5:
                    System.out.print("El recorrido en Postorden es: ");
                    A.PostOrden(A.Raiz);
                    System.out.println();

                    break;

            }//fin switch	
        } while (opc != 6);//fin do
           NodoBinario meta = new NodoBinario(4,"B");
        //System.out.println("La altura del arbol es: " + A.Altura (A.Raiz));
        	A.Anchura (A.Raiz, meta);	
    }
}
