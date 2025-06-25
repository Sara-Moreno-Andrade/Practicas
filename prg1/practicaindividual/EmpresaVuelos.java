package prg1.practicaindividual;
import java.util.Scanner;

public class EmpresaVuelos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean reservandoVuelo = true;

        String destinos[]= new String[6];
        int asientosDestinos[][] = new int[6][3];

        int destinoSeleccionado = 0;
        int horarioSeleccionado = 0;
        int cantidadPasajesSeleccionados = 0;

        String horario;

        establecerDetinos(destinos);
        establecerAsientos(asientosDestinos);

        while (reservandoVuelo) {
            mostrarMenu();
            int opcion = teclado.nextInt();
            if (opcion == 1) {
                destinoSeleccionado = preguntarDestino(destinos, teclado, destinoSeleccionado);
                horarioSeleccionado = preguntarHorario(teclado);
                horario = horario(horarioSeleccionado);
                cantidadPasajesSeleccionados = preguntarCantidadPasajes(teclado);
                comprobarReserva(destinos, asientosDestinos, destinoSeleccionado, horarioSeleccionado, cantidadPasajesSeleccionados, horario);
            }else{
                reservandoVuelo = false;
            }
        }  
    }

    public static void establecerDetinos(String destinos[]){
        destinos[0] = "Rio de Janeiro";
        destinos[1] = "Cancun";
        destinos[2] = "Madrid";
        destinos[3] = "Roma";
        destinos[4] = "Milán";
        destinos[5] = "Iguazu";
    }

    public static void establecerAsientos(int asientosDestinos[][]){
        asientosDestinos[0][0] = 120 ;
        asientosDestinos[0][1] = 15;
        asientosDestinos[0][2] = 30;

        asientosDestinos[1][0] = 65;
        asientosDestinos[1][1] = 1;
        asientosDestinos[1][2] = 2;

        asientosDestinos[2][0] = 4;
        asientosDestinos[2][1] = 52;
        asientosDestinos[2][2] = 7;

        asientosDestinos[3][0] = 46;
        asientosDestinos[3][1] = 32;
        asientosDestinos[3][2] = 16;

        asientosDestinos[4][0] = 64;
        asientosDestinos[4][1] = 23;
        asientosDestinos[4][2] = 11;

        asientosDestinos[5][0] = 61;
        asientosDestinos[5][1] = 12;
        asientosDestinos[5][2] = 91;
    }

    public static void mostrarMenu(){
        System.out.println("----Agencia de vuelos----");
        System.out.println("Seleccione una opción:");
        System.out.println("1- Reservar vuelo.");
        System.out.println("2- Salir");
        System.out.println("-------------------------");
    }

    public static int preguntarDestino(String destinos[], Scanner teclado, int destinoSeleccionado){
        System.out.println("----Reserva de vuelos----");
        System.out.println("Seleccione destino:");
        for(int fila = 0; fila < destinos.length ; fila++){
            System.out.println("Destino " + (fila+1) + " : " + destinos[fila]);
        }
        System.out.println("-------------------------");
        return (teclado.nextInt()-1);
    }

    public static int preguntarHorario(Scanner teclado){
        System.out.println("----Reserva de vuelos----");
        System.out.println("Seleccione horario:");
        System.out.println("1- Mañana");
        System.out.println("2- Mediodia");
        System.out.println("3- Noche");
        System.out.println("-------------------------");
        return (teclado.nextInt()-1);
    }

    public static int preguntarCantidadPasajes(Scanner teclado){
        System.out.println("----Reserva de vuelos----");
        System.out.println("Inserte la cantidad de pasajes:");
        System.out.println("-------------------------");
        return teclado.nextInt();
    }

    public static String horario(int horarioSeleccionado){
        String horario;
        if (horarioSeleccionado == 0) {
            horario = "Mañana";
        }else if (horarioSeleccionado == 1) {
            horario = "Mediodia";
        }else{
            horario = "Noche";
        }
        return horario;
    }

    public static void comprobarReserva(String destinos[], int asientosDestinos[][], int destinoSeleccionado, int horarioSeleccionado, int cantidadPasajesSeleccionados, String horario){
        System.out.println("----Reserva de vuelos----");
        if (asientosDestinos[destinoSeleccionado][horarioSeleccionado] > 0 && (asientosDestinos[destinoSeleccionado][horarioSeleccionado]- cantidadPasajesSeleccionados) >= 0) {
                    System.out.println("Su reserva fue realizza con éxito.");
                    asientosDestinos[destinoSeleccionado][horarioSeleccionado] = asientosDestinos[destinoSeleccionado][horarioSeleccionado] - cantidadPasajesSeleccionados;
                    System.out.println("Reservo " +cantidadPasajesSeleccionados + " pasajes para " + destinos[destinoSeleccionado] + " en el horario de la " + horario);
                }else{
                    System.out.println("Disculpe, no se pudo completar su operación dado que no ahy asientos disponibles.");
                }
        System.out.println("-------------------------");
    }

}
