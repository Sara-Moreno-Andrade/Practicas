// Una pequeña empresa desea calcular los sueldos de suss empleados. Los puestos de los mismos pueden tener 3 categorias: 1-Repositor, 2-Cajero y 3-Supervisor.
//- Los repositores cobran $15.890 +  un bono del 10%
//- Los cajeros cobran $ 25.630,89 fijos
//- Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11% de jubilación
// Se encesita un programa que, dependiendo del tipo de empleado del que se trate, calcule y muestre en pantalla el correspondiente sueldo.
import java.util.Scanner;

public class EjercicioCondicionales {
    public static void main(String[] args) {
        double sueldo;
        int categoria;

        System.out.println("Ingrese el tipo de categoria que desea calcular el sueldo:");
        System.out.println("1-Repositor");
        System.out.println("2-Cajero");
        System.out.println("3-Supervisor");
        Scanner teclado = new Scanner (System.in);

        categoria = teclado.nextInt();
        
        if (categoria == 1){
            sueldo = 15890 + (15890*0.10);
            System.out.println("El sueldo de la categoria "+ categoria +" es: $ " + sueldo );
        }else if(categoria == 2){
            sueldo = 25630.89 ;
            System.out.println("El sueldo de la categoria "+ categoria +" es: $ " + sueldo );
        }else if(categoria == 3){
            sueldo = 35560.20 - (35560.20*0.11);
            System.out.println("El sueldo de la categoria "+ categoria +" es: $ " + sueldo );
        }else{
            System.out.println("Ingrese un número de categoría válido.");
        }
    }
}
