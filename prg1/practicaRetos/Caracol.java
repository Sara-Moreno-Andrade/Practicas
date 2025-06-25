package prg1.practicaRetos;
import java.util.Scanner;

public class Caracol {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final String BORDE = "[__]              [__]";
        final String PARED = "  []:. :. :. :. :.[] _ __";
        final String FONDO = "  [][][][][][][][][]";
        final String CARACOL = "  []    _@)_/’    [] _ __";
        final String AGUA = "  []~~~~~~~~~~~~~~[] _ __"; 
        final String COCHE = "[__]    O-=-O     [__]";

        final int ULTIMA_ALTURA = 0;
        final int OPCION_LLUVIA_FUERTE = 1;
        final int OPCION_LLUVIA_MEDIA = 2;
        final int OPCION_BUEN_CLIMA = 3;

        final double PROBABILIDAD_COCHE = 0.35;
        final double PROBABILIDAD_LLUVIA_FUERTE = 0.05;
        final double PROBABILIDAD_LLUVIA_MEDIA = 0.15;
        final double PROBABILIDAD_BUEN_CLIMA = 1;

        String pozo[] = new String[21];

        int dia = 1;
        int alturaCaracol = 20;
        int alturaAgua = 20; 

        boolean subiendo = true;
        boolean pasaCoche = false;
        boolean ahogado = false;
        

        iniciarPozo(pozo, AGUA, BORDE, FONDO, PARED, CARACOL);
        mostrarPozo(pozo, FONDO);

        teclado.nextLine();

        while (!ahogado && subiendo ) {
            if (alturaCaracol > ULTIMA_ALTURA && dia < 50 ) {
                int opcionLluvia = calcularProbabilidadLluvia(OPCION_LLUVIA_FUERTE, OPCION_LLUVIA_MEDIA, OPCION_BUEN_CLIMA, PROBABILIDAD_LLUVIA_FUERTE, PROBABILIDAD_LLUVIA_MEDIA, PROBABILIDAD_BUEN_CLIMA);
                pasaCoche = calcularProbabilidadCoche(pasaCoche, PROBABILIDAD_COCHE);
                
                alturaAgua = calcularAlturaAgua(opcionLluvia, alturaAgua, OPCION_LLUVIA_FUERTE, OPCION_LLUVIA_MEDIA, OPCION_BUEN_CLIMA);

                int alturaSubida = subidaCaracol(dia);
                int alturaBajada = bajadaCaracol(pasaCoche);
                alturaCaracol = alturaCaracol - alturaSubida + alturaBajada;

                mostrarInformacion(dia, alturaSubida, alturaBajada, alturaCaracol, opcionLluvia, OPCION_LLUVIA_FUERTE,  OPCION_LLUVIA_MEDIA, OPCION_BUEN_CLIMA);

                editarPozo(alturaCaracol, alturaAgua, pozo, AGUA, BORDE, FONDO, PARED, CARACOL);
                
                mostrarBorde(pasaCoche, COCHE, BORDE);
                mostrarPozo(pozo, FONDO);

                ahogado = comprobarNoAhogado(ahogado, alturaAgua, alturaCaracol);
                dia++;

                teclado.nextLine();
            }else{
                subiendo = false;
            }
        }

        informarFinal(ahogado);
        
    }

    public static void iniciarPozo(String pozo[],final String AGUA,final String BORDE, final String FONDO, final String PARED, final String CARACOL){
        System.out.println(BORDE);
        for(int fila = 0; fila < pozo.length; fila++){
            if (fila < 19) {
                pozo[fila] = PARED;
            }else if(fila == 19){
                pozo[fila] = CARACOL;
            }else if (fila == 20){
                pozo[fila] = AGUA;
            }
        }
    }

    public static void mostrarPozo(String pozo[],final String FONDO){
        for(int fila = 0; fila < pozo.length; fila++){
            System.out.println(pozo[fila] + " " + fila);
        }
        System.out.println(FONDO);
    }

    public static int subidaCaracol(int dia){
        int movimiento;
        if (dia >= 20) {
            movimiento = (int)(Math.random() * 2) + 1;
        }else{
            movimiento = (int)(Math.random() * 4) + 1;
        }
        return movimiento;
    }

    public static int bajadaCaracol(boolean pasaCoche){
        int movimiento = (int)(Math.random() * 3);
        if (pasaCoche == true) {
            movimiento = movimiento + 2;
        }
        return movimiento;
    }

    public static void mostrarInformacion(int dia,int alturaSubida, int alturaBajada, int alturaCaracol, int opcionLluvia, final int OPCION_LLUVIA_FUERTE, final int OPCION_LLUVIA_MEDIA, final int OPCION_BUEN_CLIMA){
        System.out.println("Dia [" + dia + "] / Sube: [" + alturaSubida + "] / Baja: [" + alturaBajada + "]  / Altura final: ["+ alturaCaracol + "] " );
        if (opcionLluvia == OPCION_LLUVIA_FUERTE) {
            System.out.println("LLUVIA FUERTE !!");
        }else if(opcionLluvia == OPCION_LLUVIA_MEDIA){
            System.out.println("LLUVIA DÉBIL !!");
        }
    }

    public static void editarPozo(int alturaCaracol, int alturaAgua , String pozo[],final String AGUA,final String BORDE, final String FONDO, final String PARED, final String CARACOL){
        for(int fila = 0; fila < pozo.length; fila++){
            if (fila == alturaCaracol) {
                pozo[fila] = CARACOL;
            } else if (fila >= alturaAgua) {
                pozo[fila] = AGUA;
            }else if (fila <= alturaAgua){
                pozo[fila] = PARED;
            }
        }
    }

    public static void mostrarBorde(boolean pasaCoche, final String COCHE , final String BORDE){
        if (pasaCoche == true) {
                System.out.println(COCHE);
        }else{
            System.out.println(BORDE);
        }
    }

    public static boolean comprobarNoAhogado(boolean ahogado, int alturaAgua, int alturaCaracol){
        
        if (alturaAgua <= alturaCaracol) {
            ahogado = true;
        }else{
            ahogado = false;
        }
        return ahogado;
    }

    public static boolean calcularProbabilidadCoche(boolean pasaCoche, final double PROBABILIDAD_COCHE){   
        double probabilidadCoche = Math.random();

        if (probabilidadCoche < PROBABILIDAD_COCHE) {
            pasaCoche = true;
        }else{
            pasaCoche = false;
        }
        return pasaCoche;

    }

    public static int calcularProbabilidadLluvia(final int OPCION_LLUVIA_FUERTE, final int OPCION_LLUVIA_MEDIA, final int OPCION_BUEN_CLIMA, final double PROBABILIDAD_LLUVIA_FUERTE, final double PROBABILIDAD_LLUVIA_MEDIA,final double PROBABILIDAD_BUEN_CLIMA){
        int opcion;
        double probabilidadLluvia = Math.random();

        if (probabilidadLluvia < PROBABILIDAD_LLUVIA_FUERTE) {
            opcion = OPCION_LLUVIA_FUERTE;
        }else if (probabilidadLluvia < PROBABILIDAD_LLUVIA_MEDIA) {
            opcion = OPCION_LLUVIA_MEDIA;
        }else{
            opcion = OPCION_BUEN_CLIMA;
        }

        return opcion;

    }

    public static int calcularAlturaAgua (int opcionLluvia, int alturaAgua, final int OPCION_LLUVIA_FUERTE, final int OPCION_LLUVIA_MEDIA, final int OPCION_BUEN_CLIMA){

        if (opcionLluvia == OPCION_LLUVIA_FUERTE) {
            alturaAgua = alturaAgua - 5;
        }else if (opcionLluvia == OPCION_LLUVIA_MEDIA) {
            alturaAgua = alturaAgua - 2;
        }

        return alturaAgua;

    }

    public static void informarFinal(boolean ahogado){
        if (ahogado == true) {
            System.out.println("El caracol se ahogó.");
        }else{
            System.out.println("El caracol consiguió salir.");
        }
    }

}
