
public class Klondike {
    private static final int CANTIDAD_PALOS = 4;
    private static final int CANTIDAD_COLUMNAS = 7;

    private boolean jugando = true;

    private Menu menu = new Menu();
    private Baraja baraja = new Baraja();
    private Descarte descarte = new Descarte();

    private Palo[] palos = new Palo[CANTIDAD_PALOS];
    private Columna[] columnas = new Columna[CANTIDAD_COLUMNAS];

    public Klondike(){
        baraja = new Baraja();
        descarte = new Descarte();
        for (Palo palo : palos) palo = new Palo();
        for (int i = 0; i < columnas.length; i++) columnas[i] = new Columna(i + 1);
    }

    public void iniciar(){
        do{
            menu.mostrarOpciones();
            mostrarTepete();
            seleccionarOpcion(menu.preguntarOpcion());
        }while(estaJugando());

    }

    private void seleccionarOpcion(int indice) {
        switch (indice) {
            case 1 -> baraja.moverA(descarte);
            case 2 -> descarte.moverA(elegirPalo("A"));
            case 3 -> descarte.moverA(elegirColumna("A"));
            case 4 -> elegirPalo("De").moverA(elegirColumna("A"));
            case 5 -> elegirColumna("De").moverA(elegirPalo("A"));
            case 6 -> elegirColumna("De").moverA(elegirColumna("A"));
            case 7 -> elegirColumna("De").voltear();
            case 8 -> descarte.moverA(baraja);
            case 9 -> jugando = false; 
        }
    }

    private Palo elegirPalo(String prefijo) {
        int eleccion = escogerOpcion(prefijo, CANTIDAD_PALOS, "que palo");
        return palos[eleccion - 1];
    }

    private Columna elegirColumna(String prefijo) {
        int eleccion = escogerOpcion(prefijo, CANTIDAD_COLUMNAS, "que columna");
        return columnas[eleccion - 1];
    }

    private int escogerOpcion(String prefijo, int maximo, String mensaje){
        Console console = new Console();
        return console.readInt(prefijo + " " + mensaje + "[1-"+ maximo + "]");
    }

    private boolean estaJugando(){
        return jugando;
    }

    private void mostrarTepete() {
        System.out.println("Baraja:");
        baraja.mostrar();
        saltoDeLinea();

        System.out.println("Descarte:");
        descarte.mostrar();
        saltoDeLinea();

        for (int i = 0; i < columnas.length; i++) {
            System.out.println("Columna"+ "["+ (i+1) + "]");
            columnas[i].mostrar();
            saltoDeLinea();

        }

        for (int i = 0; i < palos.length; i++) {
            System.out.println("Palo:"+ "["+ (i+1) + "]");
            palos[i].mostrar();
            saltoDeLinea();
        }
    }

    private void saltoDeLinea() {
        System.out.println();
    }

}
