package prg1.practicaExamenes;

import java.util.Scanner;

class JuegoDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final int MAXIMO_PUNTOS = 100;

        int puntosJugador1 = 0;
        int puntosJugador2 = 0;
        int dado1 =0;
        int dado2 =0;
        int dado3 =0;

        boolean jugando = true;

        System.out.println("Juego de dados");

        while (jugando) {
            System.out.println("Turno J1");
            puntosJugador1 = (tirarDados(dado1, dado2, dado3) + puntosJugador1);
            System.out.println("Puntos J1: " + puntosJugador2);

            System.out.println("Turno J2");
            puntosJugador2 = (tirarDados(dado1, dado2, dado3) + puntosJugador2);
            System.out.println("Puntos J2: " + puntosJugador2);

            System.out.println("Presione Enter para continuar...");

            jugando = comprobarGanador(MAXIMO_PUNTOS, jugando, puntosJugador1, puntosJugador2);

            teclado.nextLine(); 
        }  
    }

    public static int tirarDados(int dado1, int dado2, int dado3){
        int puntosTiro = 0;

        dado1 = (int) (Math.random() * 6 + 1);
        dado2 = (int) (Math.random() * 6 + 1);
        dado3 = (int) (Math.random() * 6 + 1);
        
        System.out.println("Dados: " + dado1 + " " + dado2 + " " + dado3);

        if (dado1 == dado2 && dado2 == dado3) {
            puntosTiro =  6;
        }
        if (dado1 == dado2 || dado2 == dado3 || dado1 == dado3) {
            puntosTiro = 2;
        }
        if (dado1 != dado2 && dado2 != dado3 && dado1 != dado3) {
            puntosTiro = Math.max(Math.max(dado1, dado2), dado3);
        }
 
        return puntosTiro;
    }
    public static boolean comprobarGanador(final int MAXIMO_PUNTOS,boolean jugando, int puntosJugador1, int puntosJugador2){
        if (puntosJugador1 >= MAXIMO_PUNTOS) {
            System.out.println("¡Gana J1!");
            jugando = false;
        }else if(puntosJugador2 >= MAXIMO_PUNTOS) {
            System.out.println("¡Gana J2!");
            jugando = false;
        }
        return jugando;
    }


   

}
