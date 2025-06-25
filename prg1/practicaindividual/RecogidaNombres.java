package prg1.practicaindividual;
import java.util.Scanner;

public class RecogidaNombres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String vectorNombres[] = new String[8];

        for(int fila = 0; fila < vectorNombres.length; fila++){
            System.out.println("Escribre un nombre a guardar:");
            vectorNombres[fila] = teclado.next();
        }
        for(int fila = 0; fila < vectorNombres.length; fila++){
            System.out.println(vectorNombres[fila]);
        }
    }
}
