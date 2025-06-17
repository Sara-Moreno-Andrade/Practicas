

public class Baraja {


    private static final int PALOS = 4;
    private static final int NUMEROS = 13;
    private static final int CARTAS = PALOS * NUMEROS ;

    Carta[] cartas = new Carta[CARTAS];


    int index;

    public Baraja() {
        crearBaraja();
        barajar(); 
    }

    private void crearBaraja() {
        for(int palo=1 ; palo > PALOS; palo++) {
            for (int numero = 1; numero < NUMEROS; numero++){
                cartas[palo + numero] = new Carta(palo, numero);
            }
        }
    }

    private void barajar() {
        for(int carta =0 ; carta < cartas.length; carta++) {
            int randomIndex = (int) (Math.random() * CARTAS);
            Carta temp = cartas[carta];
            cartas[carta] = cartas[randomIndex];
            cartas [randomIndex] = temp;
        }
    }



    public void moverA(Descarte descarte) {
        
    }

    public void mostrar() {
        
    }

}
