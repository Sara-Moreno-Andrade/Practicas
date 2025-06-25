package prg1.practicaRetos;
import java.util.Scanner;

public class ClasificacionEdades {
    public static void main(String[] args) {

        int edad = pregunarEdad();

        clasidicarEdad(edad);
        
    }
    
    public static int pregunarEdad(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su edad");

        return teclado.nextInt();
    }

    public static void clasidicarEdad(int edad){
        String etapaVida;

        if (edad > 0 && edad < 100) {
            if (edad <= 5) {
                etapaVida = "Primera Infancia";
            }else if (edad <= 11) {
                etapaVida = "Infancia";
            }else if (edad <= 18 ){
                etapaVida = "Adolescencia";
            }else if (edad <= 25) {
                etapaVida = "Juventud";
            }else if (edad <= 59) {
                etapaVida = "Adultos";
            }else{
                etapaVida = "Persona Mayor";
            }
            System.out.println(etapaVida);
        }else{
            System.out.println("Edad no válida.");
        }
        
        
    }
}
