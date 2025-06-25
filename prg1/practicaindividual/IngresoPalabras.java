package prg1.practicaindividual;
import java.util.Scanner;
public class IngresoPalabras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String palabra = "";
        while (!palabra.equals("salir") && !palabra.equals("Salir") ) {
            System.out.println("Ingrese una palabra: ");
            palabra = teclado.next();
            System.out.println("La palabra es: " + palabra);
        }
        
    }
}
