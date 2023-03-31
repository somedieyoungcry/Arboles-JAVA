package ABB;

import Basic.*;
import java.util.Scanner;

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc;
        int x,b;
        Nodo aux;
        Informacion elemento;
        ArbolBB A = new ArbolBB();
        Scanner entrada = new Scanner(System.in);
        do {
            opc = Menu();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el elemento");
                    x = entrada.nextInt();
                    elemento = new Informacion(x);
                    A.Inserta(elemento);
                    break;
                case 2:
                    A.Preorden();
                    break;
                case 3:
                    A.Inorden();
                    break;
                case 4:
                    A.Postorden();
                    break;
                case 5:
                    aux = A.BuscaMinimo();
                    if(aux != null){
                        System.out.println("El minimo de el arbol es " + aux.getElem().getX());
                    }else{
                        System.out.println("El arbol esta vacio");
                    }
                    break;
                case 6:
                    aux = A.buscaMax();
                    if(aux != null){
                        System.out.println("El maximo de el arbol es " + aux.getElem().getX());
                    }else{
                        System.out.println("El arbol esta vacio");
                    }
                    break;
                case 7:
                    System.out.println("Que elemento deseas buscar");
                    x = entrada.nextInt();
                    elemento = new Informacion(x);
                    aux = A.Busca(elemento);
                    if(aux != null){
                        System.out.println("El elemento " + elemento.getX() + " esta en el arbol");
                    }else{
                        System.out.println("El elemento " + elemento.getX() + " no esta en el arbol");
                    }
                    break;
                case 8:
                    System.out.println("Ingrese el elemento que deseas eliminar");
                    x = entrada.nextInt();
                    elemento = new Informacion(x);
                    A.Elimina(elemento);
                            /*if (aux != null) {
                                System.out.println("El elemento " + elemento.getX() + " se elimino del arbol.");
                            }else{
                                 System.out.println("El elemento " + elemento.getX() + " no se elimino del arbol.");
                            }*/
                    break;
                case 9:
                   int n = A.CuentaNodos(A);
                     if (n != 1) {
                        System.out.println("El árbol tiene " + n +  " nodos");
                    } else if(n==1){
                         System.out.println("El árbol tiene " + n +  " nodo");
                    }else {
                        System.out.println("El árbol esta vacio");
                    }
                    break;
                default:
                    System.out.println(":::Opcion incorrecta, vuelva a intentar\n\n");
                    break;
            }
        } while (opc != 0);
    }

    public static int Menu() {
        int opcion = 0;
        do {
            System.out.println("");
            System.out.println("---------- Árboles de Búsqueda Binaria -------------\n");
            System.out.println("Elija una de las siguientes opciones: \n");
            System.out.println("\b 1) Insertar elemento");
            System.out.println("\b 2) Muestra en Pre-orden");
            System.out.println("\b 3) Muestra en En-orden");
            System.out.println("\b 4) Muestra en Post-orden");
            System.out.println("\b 5) Muestra mínimo");
            System.out.println("\b 6) Muestra máximo");
            System.out.println("\b 7) Busca elemento");
            System.out.println("\b 8) Elimina elemento");
            System.out.println("\b 9) Cuenta Nodos");
            System.out.println("\b 0) Salir\n");
            System.out.print("::: ");
            Scanner scan = new Scanner(System.in);
            opcion = scan.nextInt();
        } while (opcion < 0 && opcion > 8);
        return opcion;
    }
}
