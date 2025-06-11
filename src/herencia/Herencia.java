package herencia;

public class Herencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();

        empleado1.getNumero();
        empleado1.getNombre();

        Consultor consul = new Consultor();

        consul.getNombre_consultora();
        consul.getNombre();

    }
}
