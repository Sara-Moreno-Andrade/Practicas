package prg1.practicaindividual;

import java.util.Scanner;

public class TemperaturasCiudades {
    public static void main(String[] args) {
        String nombres[] = new String[5];
        int tempMax[] = new int[5];
        int tempMin[] = new int[5];

        int ciudadTempMasAlta;
        int ciudadTempMasBaja;

        Scanner teclado = new Scanner(System.in);

        preguntarCiudades(nombres, teclado);
        preguntarTempMax(nombres, tempMax, teclado);
        preguntarTempMin(nombres, tempMin, teclado);

        ciudadTempMasAlta = calcularTempAlta(nombres, tempMax);
        ciudadTempMasBaja = calcularTempBaja(nombres, tempMin);

        escribirInformacion(nombres, tempMin, tempMax, ciudadTempMasAlta, ciudadTempMasBaja);
    }

    public static void preguntarCiudades(String nombres[], Scanner teclado){
        for(int fila = 0; fila < nombres.length ; fila++){
            System.out.println("Inserte el nombre de la ciudad número " + (fila+1));
            nombres[fila] = teclado.next();
        }
    }

    public static void preguntarTempMax(String nombres[],int tempMax[], Scanner teclado){
        for(int fila = 0; fila < tempMax.length ; fila++){
            System.out.println("Inserte la temperatura máxima de la ciudad " + nombres[fila] + " :");
            tempMax[fila] = teclado.nextInt();
        }
    }

    public static void preguntarTempMin(String nombres[],int tempMin[], Scanner teclado){
        for(int fila = 0; fila < tempMin.length ; fila++){
            System.out.println("Inserte la temperatura mínima de la ciudad " + nombres[fila] + " :");
            tempMin[fila] = teclado.nextInt();
        }
    }

    public static int calcularTempAlta(String nombres[],int tempMax[]){
        int numeroCiudadMasAlta = 0;
        int TempAlta = 0;
        for(int fila = 0; fila < tempMax.length ; fila++){
            if (TempAlta < tempMax[fila]) {
                numeroCiudadMasAlta = fila;
                TempAlta = tempMax[fila];
            }
        }
        return numeroCiudadMasAlta; 
    }

    public static int calcularTempBaja(String nombres[],int tempMin[]){
        int numeroCiudadMasBaja = 0;
        int TempBaja = 100000000;
        for(int fila = 0; fila < tempMin.length ; fila++){
            if (TempBaja > tempMin[fila]) {
                numeroCiudadMasBaja = fila;
                TempBaja = tempMin[fila];
            }
        }
        return numeroCiudadMasBaja; 
    }

    public static void escribirInformacion(String nombres[],int tempMin[],int tempMax[], int ciudadTempMasAlta, int ciudadTempMasBaja){
        for(int fila = 0; fila < nombres.length ; fila++){
            System.out.println("Ciudad " + (fila+1) + " : "+ nombres[fila]);
        }

        System.out.println("--------------------");

        for(int fila = 0; fila < tempMax.length ; fila++){
            System.out.println("Temperatura máxima de "+ nombres[fila] + " : " + tempMax[fila]);
        }

        System.out.println("--------------------");

        for(int fila = 0; fila < tempMin.length ; fila++){
           System.out.println("Temperatura mínima de "+ nombres[fila] + " : " + tempMin[fila]);
        }
        System.out.println("--------------------");

        System.out.println("La ciudad con temperatura más alta es " + nombres[ciudadTempMasAlta] + " con " + tempMax[ciudadTempMasAlta]+ " º.");
        System.out.println("La ciudad con temperatura más baja es " + nombres[ciudadTempMasBaja]+ " con " + tempMin[ciudadTempMasBaja]+ " º.");

        System.out.println("--------------------");
    }
}
