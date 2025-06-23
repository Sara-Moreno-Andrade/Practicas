package prg1.practica;
import java.util.Scanner;

public class Maraton {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean inscribiendose = true;

        String categoria;
        long dni;
        String nombre;
        int edad;

        while (inscribiendose) {
            mostrarMenu();
            int opcion = teclado.nextInt();
            
            if (opcion == 1) {
                dni = preguntarDni(teclado);
                nombre = preguntarNombre(teclado);
                edad = preguntarEdad(teclado);
                categoria = indicarCategoria(edad);

                System.out.println("Inscripción completada en " + categoria + " :");
                System.out.println("Dni: "+ dni);
                System.out.println("Nombre: "+ nombre);
                System.out.println("Edad: "+ edad);
                
            }else if (opcion == 2) {
                inscribiendose = false;
            }else{
                System.out.println("Número no válido.");
            }   
        }
    }

    public static void mostrarMenu(){
        System.out.println("Qué desea hacer:");
        System.out.println("1- Inscripción");
        System.out.println("2- Salir");
    }

    public static long preguntarDni(Scanner teclado ){
        System.out.println("Ingrese dni:");
        return teclado.nextLong();
    }

    public static String preguntarNombre(Scanner teclado ){
        System.out.println("Ingrese nombre:");
        return teclado.next();
    }

    public static int preguntarEdad(Scanner teclado ){
        System.out.println("Ingrese edad:");
        return teclado.nextInt();
    }

    public static String indicarCategoria (int edad){
        String categoria = "";
        if (edad>= 6 && edad <= 10) {
            categoria = "Menores A";
        }else if (edad>= 11 && edad <= 17) {
            categoria = "Menores B";
        }else if (edad>= 18 && edad <= 30) {
            categoria = "Juveniles";
        }else if (edad>= 31 && edad <= 50) {
            categoria = "Adultos";
        }else if (edad > 50) {
            categoria = "Adultos mayores";
        }else{
            System.out.println("Edad no válida");
        }
        return categoria;
    }
}
