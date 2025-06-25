package prg1.practicaindividual;
import java.util.Scanner;

public class Anfiteatro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String mapaAnfiteatro[][] = new String[10][10];

        boolean reservando = true;
        boolean asientoLibre;

        iniciarMapa(mapaAnfiteatro);
        mostrarMapa(mapaAnfiteatro);

        while (reservando) {
            mostraMenu();
            int opcion = teclado.nextInt();
            if (opcion <3) {
                if (opcion == 1) {
                    int fila = preguntarFila(teclado);
                    int columna = preguntarColumna(teclado);
                    asientoLibre = comprobarAsientoLibre(fila, columna, mapaAnfiteatro);
                    if (asientoLibre == true) {
                        mapaAnfiteatro[fila][columna] = "X";
                        System.out.println("Ha reservado el asiento en la fila "+ (fila+1) + " columna " + (columna+1));
                    }else{
                        System.out.println("El asiento seleccionado esta ocupado.");
                    }
                }else{
                    mostrarMapa(mapaAnfiteatro);
                }
            }else if (opcion == 3) {
                reservando = false;
            }else{
                System.out.println("Opción no válida");
            }
            
        }

    }

    public static void iniciarMapa(String mapaAnfiteatro[][]){
        for(int fila = 0; fila < mapaAnfiteatro.length; fila++){
            for(int columna = 0; columna < mapaAnfiteatro.length; columna++){
                mapaAnfiteatro[fila][columna] = "L";
            }
        }
    }

    public static void mostrarMapa(String mapaAnfiteatro[][]){
        System.out.println("Columna: 1 2 3 4 5 6 7 8 9 10");
        for(int fila = 0; fila < mapaAnfiteatro.length; fila++){
            System.out.print("Fila " + (fila +1) + " :");
            for(int columna = 0; columna < mapaAnfiteatro.length; columna++){                
                System.out.print( " "+ mapaAnfiteatro[fila][columna]);
            }
            System.out.println(" ");
        }
    }

    public static void mostraMenu(){
        System.out.println("----Reserva Anfiteatro----");
        System.out.println("1- Reservar asiento");
        System.out.println("2- Mostrar mapa");
        System.out.println("3- Salir");
        System.out.println("--------------------------");
    }

    public static int preguntarFila(Scanner teclado){
        System.out.println("Ingrese una fila del 1~10:");
        return (teclado.nextInt()-1);
    }

    public static int preguntarColumna(Scanner teclado){
        System.out.println("Ingrese una columna del 1~10:");
        return (teclado.nextInt()-1);
    }

    public static boolean comprobarAsientoLibre(int fila, int columna, String mapaAnfiteatro[][]){
        boolean libre;
        
        if (mapaAnfiteatro[fila][columna] == "L") {
            libre = true;
        }else{
            libre = false;
        }
        return libre;
    }
}
