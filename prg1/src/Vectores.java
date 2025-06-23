import java.util.Scanner;
public class Vectores{
    public static void main(String[] args) {
        int vector[] = new int [4];

        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i<vector.length; i++){
            System.out.println("Ingrese le valor para el indice "+ i);
            vector[i] = teclado.nextInt();
        }
        for (int i = 0; i < vector.length ; i++){
           System.out.println("Posición: " + i);
           System.out.println(vector[i]); 
           System.out.println("------------------------");
        }
    }
}