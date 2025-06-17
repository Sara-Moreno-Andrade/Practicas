import java.util.Scanner;

public class Clasificacion {
    public static void main(String[] args) {
        System.out.println("Ingrese una edad entre 0 y 100");

        Scanner scanner = new Scanner (System.in);
        int edad = scanner.nextInt() ;

        String etapaVida = " ";

        if (edad < 0 ) {
            etapaVida = "Inválida";
        }else if (edad <= 5) {
            etapaVida = "Primera infancia";
        }else if (edad <= 11) {
            etapaVida = "Infancia";
        }else if (edad <= 18) {
            etapaVida = "Adolescente";
        }else if (edad <= 25) {
            etapaVida = "Juventud";
        }else if (edad <= 59) {
            etapaVida = "Adultos";
        }else if (edad <= 100) {
            etapaVida = "Persona mayor";
        }else {
            etapaVida = "Inválida";
        }


    } 
}
