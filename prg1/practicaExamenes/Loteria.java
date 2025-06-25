package prg1.practicaExamenes;

import java.util.Scanner;

public class Loteria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final int ACIERTOS_PRIMERA_CATEGORIA = 6;
        final int ACIERTOS_SEGUNDA_CATEGORIA = 5;
        final int ACIERTOS_TERCERA_CATEGORIA = 4;
        final int CANTIDAD_NUMEROS = 6;

        int[] boletoGanador = { 3, 7, 12, 15, 25, 35 };
        int[] miBoleto = new int[6];

        preguntarNumeros(teclado, CANTIDAD_NUMEROS, miBoleto);
        int aciertos = contarAciertos(boletoGanador, miBoleto);
        informarCategoria(aciertos, ACIERTOS_PRIMERA_CATEGORIA, ACIERTOS_SEGUNDA_CATEGORIA, ACIERTOS_TERCERA_CATEGORIA);
             
    }

    public static void preguntarNumeros(Scanner teclado,final int CANTIDAD_NOTAS, int miBoleto[]){
        System.out.println("Introduce tus 6 números (1-49):");

        for (int fila = 0; fila < CANTIDAD_NOTAS; fila++) {
            System.out.print("Número " + (fila + 1) + ": ");
            miBoleto[fila] = teclado.nextInt();
        }
    }

    public static int contarAciertos(int boletoGanador[], int miBoleto[]){
        int aciertos = 0;
        for (int fila = 0; fila < boletoGanador.length; fila++) {
            for (int filaMiBoleto = 0; filaMiBoleto < miBoleto.length; filaMiBoleto++) {
                if (boletoGanador[fila] == miBoleto[filaMiBoleto]) {
                    aciertos++;
                }
            }
        }
        return aciertos;
    }

    public static void informarCategoria(int aciertos,final int ACIERTOS_PRIMERA_CATEGORIA,final int ACIERTOS_SEGUNDA_CATEGORIA ,final int ACIERTOS_TERCERA_CATEGORIA){
        System.out.println("Has acertado " + aciertos + " números");
        if (aciertos == ACIERTOS_PRIMERA_CATEGORIA) {
            System.out.println("¡Primera categoría!");
        } else if (aciertos == ACIERTOS_SEGUNDA_CATEGORIA) {
            System.out.println("¡Segunda categoría!");
        } else if (aciertos == ACIERTOS_TERCERA_CATEGORIA) {
            System.out.println("¡Tercera categoría!");
        } else {
            System.out.println("Sin premio");
        }
    }
}
