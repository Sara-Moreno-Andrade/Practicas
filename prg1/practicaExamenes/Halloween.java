package prg1.practicaExamenes;

public class Halloween {
    public static void main(String args[]) {

        final int MAXIMO_PISOS = 5;
        final int MAXIMO_CARAMELOS_BOLSA = 20;
        final int CASAS_POR_PISO = 4;

        int pisoActual = 1;   
        int casasVisitadas = 0;  
        int caramelosNino1 = 0;
        int caramelosNino2 = 0;
        int caramelosNino3 = 0;

        boolean bolsaLlenaNino1 = false;
        boolean bolsaLlenaNino2 = false;
        boolean bolsaLlenaNino3 = false;
        boolean bolsasLlenas = false;
        boolean cogiendoChuches = true;
      
        while(cogiendoChuches ){  
            System.out.println("\n=== Piso " + pisoActual + " ===");
            
            int casaActual = 1;

            while(casaActual <= CASAS_POR_PISO && cogiendoChuches ){  

                bolsasLlenas = comprobarBolsasLlenas(MAXIMO_CARAMELOS_BOLSA, cogiendoChuches, bolsaLlenaNino1, bolsaLlenaNino2, bolsaLlenaNino3, caramelosNino1, caramelosNino2, caramelosNino3);

                if (bolsasLlenas) {
                    mensajeLleno();
                    cogiendoChuches = false;
                }else{      

                    mensajeVisita(casaActual, pisoActual);
                
                    double suerte = Math.random() * 100 + 1;

                    if((int)suerte <= 70){
                        mensajeAbierto();
                        caramelosNino1 =  calcularCaramelosNino1(MAXIMO_CARAMELOS_BOLSA, bolsaLlenaNino1, bolsaLlenaNino2, bolsaLlenaNino3, caramelosNino1, caramelosNino2, caramelosNino3);
                        caramelosNino2 = calcularCaramelosNino2(MAXIMO_CARAMELOS_BOLSA, bolsaLlenaNino1, bolsaLlenaNino2, bolsaLlenaNino3, caramelosNino1, caramelosNino2, caramelosNino3);
                        caramelosNino3 = calcularCaramelosNino3(MAXIMO_CARAMELOS_BOLSA, bolsaLlenaNino1, bolsaLlenaNino2, bolsaLlenaNino3, caramelosNino1, caramelosNino2, caramelosNino3);
                                
                    }else{ 
                        mesajeCasaCerrada();
                    }
                    casaActual++;
                    casasVisitadas++;
                }

            }
               
            cogiendoChuches = comprobarPisoActual(pisoActual, MAXIMO_PISOS, cogiendoChuches);

            pisoActual++;

            System.out.println("\n==============");
        }
            
        mensajeFinal(casasVisitadas, caramelosNino1, caramelosNino2, caramelosNino3, bolsaLlenaNino1, bolsaLlenaNino2, bolsaLlenaNino3);
    }
    
    public static boolean comprobarBolsasLlenas(final int MAXIMO_CARAMELOS_BOLSA,boolean bolsasllenas, boolean bolsaLlenaNino1, boolean bolsaLlenaNino2, boolean bolsaLlenaNino3, int caramelosNino1,  int caramelosNino2,  int caramelosNino3){
        if (caramelosNino1 == MAXIMO_CARAMELOS_BOLSA) {
            bolsaLlenaNino1 = true;
        }
        if (caramelosNino2 == MAXIMO_CARAMELOS_BOLSA) {
           bolsaLlenaNino2 = true; 
        }
        if (caramelosNino3 == MAXIMO_CARAMELOS_BOLSA) {
            bolsaLlenaNino3 = true;
        }
        if(bolsaLlenaNino1 && bolsaLlenaNino2 && bolsaLlenaNino3){
            bolsasllenas = true;
        }else{
            bolsasllenas = false;
        }
        return bolsasllenas;
    }
    public static boolean comprobarPisoActual(int pisoActual, final int MAXIMO_PISOS, boolean cogiendoChuches){     
        if(pisoActual == MAXIMO_PISOS){ 
            cogiendoChuches = false; 
        }
        return cogiendoChuches;
    }
    public static int calcularCaramelosNino1(final int MAXIMO_CARAMELOS_BOLSA, boolean bolsaLlenaNino1, boolean bolsaLlenaNino2, boolean bolsaLlenaNino3, int caramelosNino1,  int caramelosNino2,  int caramelosNino3){
        if(bolsaLlenaNino1 == false){
            double suerteNino1 = Math.random() * 100 + 1;

            if((int)suerteNino1 <= 80){
                int caramelosDan = (int)(Math.random() * 3 + 1);
                caramelosNino1 = caramelosNino1 + caramelosDan;
                System.out.print("Niño 1 recibió " + caramelosDan + " caramelos ");
                                            
                if(caramelosNino1 >= MAXIMO_CARAMELOS_BOLSA){ 
                    caramelosNino1 = MAXIMO_CARAMELOS_BOLSA;
                    System.out.println("¡La bolsa del niño 1 está llena!"); 
                }
            }
        }
        return caramelosNino1;
    }
    public static int calcularCaramelosNino2(final int MAXIMO_CARAMELOS_BOLSA, boolean bolsaLlenaNino1, boolean bolsaLlenaNino2, boolean bolsaLlenaNino3, int caramelosNino1,  int caramelosNino2,  int caramelosNino3){
        if(bolsaLlenaNino2 == false){
            double suerteNino2 = Math.random() * 100 + 1;

            if((int)suerteNino2 <= 80){
                int caramelosDan = (int)(Math.random() * 3 + 1);
                caramelosNino2 = caramelosNino2 + caramelosDan;
                System.out.println("Niño 2 recibió " + caramelosDan + " caramelos ");
                                                
                if(caramelosNino2 >= MAXIMO_CARAMELOS_BOLSA){ 
                    caramelosNino2 = MAXIMO_CARAMELOS_BOLSA;
                    System.out.println("¡La bolsa del niño 2 está llena!"); 
                }
            }
        }

        return caramelosNino2;
    }   
    public static int calcularCaramelosNino3(final int MAXIMO_CARAMELOS_BOLSA, boolean bolsaLlenaNino1, boolean bolsaLlenaNino2, boolean bolsaLlenaNino3, int caramelosNino1,  int caramelosNino2,  int caramelosNino3){

        if(bolsaLlenaNino3 == false){
            double suerteNino3 = Math.random() * 100 + 1;

            if((int)suerteNino3 <= 80){
                
                int caramelosDan = (int)(Math.random() * 3 + 1);
                caramelosNino3 = caramelosNino3 + caramelosDan;
                System.out.println("Niño 3 recibió " + caramelosDan + " caramelos ");
                                            
                if(caramelosNino3 >= MAXIMO_CARAMELOS_BOLSA){ 
                    caramelosNino3 = MAXIMO_CARAMELOS_BOLSA;
                    System.out.println("¡La bolsa del niño 3 está llena!"); 
                }
            }
        }
        return caramelosNino3;
    }
    public static void mesajeCasaCerrada(){
        System.out.println("Casa cerrada, seguimos adelante..."); 
    }
    public static void mensajeFinal(int casasVisitadas, int caramelosNino1, int caramelosNino2, int caramelosNino3, boolean bolsaLlenaNino1, boolean bolsaLlenaNino2, boolean bolsaLlenaNino3){
        System.out.println("\n=== Resultados Finales ===");
        System.out.println("Casas visitadas: " + casasVisitadas);
        System.out.println("Niño 1: " + caramelosNino1 + " caramelos" + (bolsaLlenaNino1 ? " (Bolsa llena)" : ""));
        System.out.println("Niño 2: " + caramelosNino2 + " caramelos" + (bolsaLlenaNino2 ? " (Bolsa llena)" : ""));
        System.out.println("Niño 3: " + caramelosNino3 + " caramelos" + (bolsaLlenaNino3 ? " (Bolsa llena)" : ""));
    }
    public static void mensajeLleno(){
        System.out.println("");
        System.out.println("Las bolsas están llenas, terminamos búsqueda!");
    }
    public static void mensajeAbierto(){
        System.out.println("¡La casa está abierta!");
        System.out.println(" ");

    }
    public static void mensajeVisita(int casaActual, int pisoActual){
        System.out.print("\nVisitando casa " + casaActual + " del piso " + pisoActual + " : ");
    }
}
