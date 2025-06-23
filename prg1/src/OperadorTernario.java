import java.util.Scanner;
public class OperadorTernario {
    public static void main(String[] args) {
        double promedio;
        String condicionFinal;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el promedio general del alumno en TodoCode");

        promedio = teclado.nextInt();

        condicionFinal = (promedio >= 5) ? "Aprobado" : "Suspenso";

        System.out.println("La condición final de la laumno es: " + condicionFinal);

    }
}
