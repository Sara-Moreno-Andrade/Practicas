package prg1.practicaExamenes;

import java.util.Scanner;

class GestionNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final int CANTIDAD_NOTAS = 10;
        final int NOTA_APROBADA = 5;

        int[] notas = new int[10];

        double media;
        int cantidadAprobados;
        int cantidadSuspensos;

        int notaMax;
        int notaMin;

        preguntarNotas(teclado, CANTIDAD_NOTAS, notas);
        media = hacerMedia(teclado, CANTIDAD_NOTAS, notas);
        cantidadAprobados = contarAprobados(teclado, NOTA_APROBADA, notas);
        cantidadSuspensos = contarSuspensos(cantidadAprobados, CANTIDAD_NOTAS);
        notaMax = calcularNotaMax(teclado, notas);
        notaMin = calcularNotaMin(teclado, notas);
        informarNotas(CANTIDAD_NOTAS, notas, NOTA_APROBADA, cantidadAprobados, cantidadSuspensos, notaMax, notaMin);

    }

    private static void preguntarNotas(Scanner teclado,final int CANTIDAD_NOTAS, int notas[]){
        System.out.println("Introduce "+ CANTIDAD_NOTAS + " notas:");

        for (int numeroAlumno = 0; numeroAlumno < notas.length; numeroAlumno++) {
            System.out.print("Nota del Alumno " + (numeroAlumno + 1) + ": ");
            notas[numeroAlumno] = teclado.nextInt();
        }
    }

    private static int hacerMedia(Scanner teclado,final int CANTIDAD_NOTAS, int notas[]){
        int sumaNotas = 0;

        for (int numeroAlumno = 0; numeroAlumno < notas.length; numeroAlumno++) {
            sumaNotas = sumaNotas + notas[numeroAlumno];
        }

        sumaNotas = sumaNotas / CANTIDAD_NOTAS;

        return sumaNotas;
    }

    private static int contarAprobados(Scanner teclado,final int NOTA_APROBADA, int notas[]){
        int cantidadAprobados = 0;

        for (int numeroAlumno = 0; numeroAlumno < notas.length; numeroAlumno++) {
            if (notas[numeroAlumno] >= NOTA_APROBADA) {
                cantidadAprobados++;
            }
        }

        return cantidadAprobados;
    }

    private static int contarSuspensos(int cantidadAprobados, final int CANTIDAD_NOTAS){
        return (CANTIDAD_NOTAS - cantidadAprobados);
    }

    private static int calcularNotaMax(Scanner teclado, int notas[]){
        int notaMax = 0;

        for (int numeroAlumno = 0; numeroAlumno < notas.length; numeroAlumno++) {
            if (notas[numeroAlumno] > notaMax) {
                notaMax = notas[numeroAlumno];
            }
        }

        return notaMax;
    }

    private static int calcularNotaMin(Scanner teclado, int notas[]){
        int notaMin = 10;

        for (int numeroAlumno = 0; numeroAlumno < notas.length; numeroAlumno++) {
            if (notas[numeroAlumno] < notaMin) {
                notaMin = notas[numeroAlumno];
            }
        }

        return notaMin;
    }

    public static void informarNotas(final int CANTIDAD_NOTAS, int notas[],int media, int aprobados,int suspensos, int notaMax,int notaMin){
        System.out.println("Media: " + media);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspensos: " + suspensos);
        System.out.println("Nota máxima: " + notaMax);
        System.out.println("Nota mínima: " + notaMin);

        for (int numeroAlumno = 0; numeroAlumno < CANTIDAD_NOTAS; numeroAlumno++) {
            System.out.print("Alumno " + (numeroAlumno + 1) + ": ");
            for (int estrellas = 0; estrellas < notas[numeroAlumno]; estrellas++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
