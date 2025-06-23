//Ejercicio 1: 
//Realizar un programa que permita cargar 15 números en un  vector. 
//Una vez cargados, se necesita que el programa cuente e informe cuantas veces se cargó el número 3.

//Ejercicio2: 
//En una tabla de 4 filas y de 4 columnas se guardan las notas de 4 alumnos de secundaria.
//Cada fila corresponde a las notas y al primedio de cada alumno.
//Se necesita un programa que permita a un profesor cargar, en las 3 posiciones (columnas) de cada fila, las notas del alumno y que en la última columna se calculen los promedios.
//Una vez realizados los cálcilos, se desea mopstrarlas 3 notas de cada alumno y el promedio correspondiente recorrieno la matriz.
import java.util.Scanner;
public class EjercicioVector {
    public static void main(String[] args) {

        System.out.println("Ejercicio 1:");
        int vector[] = new int [15];

        int contadorTreses = 0;

        for(int i = 0; i < vector.length; i++){
            int numeroAleatorio= (int)(Math.random() * (10-1+1))+ 1;
            vector[i] = numeroAleatorio;

            System.out.println(vector[i]);
            
            if (vector[i] == 3) {
                contadorTreses++;
            }
        }

        System.out.println("En total hay " + contadorTreses + " treses.");

        System.out.println("----------------------");

        System.out.println("Ejercicio 2:");


        double matriz[][] = new double[4][4];

        for(int fila = 0; fila < 4 ; fila++){
            for(int columna = 0 ; columna < 4; columna++){
                if (columna <= 2) {
                    System.out.println("Ingrese la nota "+ (columna+1) + " del alumno " + (fila+1));
                    Scanner teclado = new Scanner(System.in);
                    matriz[fila][columna] = teclado.nextDouble();
                }else{
                    matriz[fila][3] = (matriz[fila][0] + matriz[fila][1] + matriz[fila][2])/3;
                }
            }
        }


        System.out.print("Alumno 1 : "); 
        for(int columna = 0 ; columna < 4; columna++){
            System.out.print(" " + matriz[0][columna] + " " );
        }
        
        System.out.println("");
        System.out.print("Alumno 2 : ");
        
        for(int columna = 0 ; columna < 4; columna++){
            System.out.print(" " + matriz[1][columna] + " " );
        }
        
        System.out.println("");
        System.out.print("Alumno 3 : ");

        for(int columna = 0 ; columna < 4; columna++){
            System.out.print(" " + matriz[2][columna] + " " );
        }

        System.out.println("");
        System.out.print("Alumno 4 : ");

        for(int columna = 0 ; columna < 4; columna++){
            System.out.print(" " + matriz[3][columna] + " " );
        }
        
    }
}