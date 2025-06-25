package prg1.practicaindividual;
import java.util.Scanner;

public class AgendaElectroncia {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String dni[] = new String[10];
        String nombre[] = new String[10];     
        long teléfono[] = new long[10];


        boolean viendoAgenda = true;

        while (viendoAgenda) {

            mostrarMenu(teclado);
            int opcion = teclado.nextInt();

            if (opcion < 3 && opcion > 0) {
                if (opcion == 1) {
                    mostrarContactos(teclado, nombre, dni, teléfono);
                    System.out.println("Seleccione contacto a editar.");
                    int contactoEditar = (teclado.nextInt()-1);
                    editarContacto(contactoEditar, teclado, nombre, dni, teléfono);;
                }else{
                    mostrarContactos(teclado, nombre, dni, teléfono);
                }
            }else if (opcion == 3){
                viendoAgenda = false;
            }else{
                System.out.println("Opción no válida");
            }
        }

    }

    public static void mostrarMenu(Scanner teclado){
        System.out.println("----Agenda Electrónica----");
        System.out.println("Seleccione una opción:");
        System.out.println("1- Añadir/Editar contacto");
        System.out.println("2- Ver contactos");
        System.out.println("3- Salir");
        System.out.println("--------------------------");

    }

    public static void mostrarContactos (Scanner teclado, String nombre[], String dni[], long telefono[] ){
        for(int fila = 0; fila <  nombre.length ; fila++){
            System.out.println("Contacto " + (fila+1) + " : " + nombre[fila]+ " " + dni[fila] + " " + telefono[fila]);
        }
    }

    public static void editarContacto (int contactoEditar, Scanner teclado, String nombre[], String dni[], long telefono[]){
        
        System.out.println("Ingrese Dni:");
        dni[contactoEditar] = teclado.next();
        System.out.println("Ingrese Nombre:");
        nombre[contactoEditar] = teclado.next();
        System.out.println("Ingrese Teléfono:");
        telefono[contactoEditar] = teclado.nextLong();
    }

}
