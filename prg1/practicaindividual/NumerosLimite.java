package prg1.practicaindividual;
import java.util.Scanner;

public class NumerosLimite {
    public static void main(String[] args) {
        System.out.println("Ingrese el límite hasta el que quiere contar.");

        Scanner teclado = new Scanner(System.in);

        int limite = teclado.nextInt();

        for(int i =0 ; i<= limite; i++){
            System.out.println(i);
        }

    }
}
