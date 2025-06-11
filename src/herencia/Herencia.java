package herencia;

public class Herencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();

        empleado1.getNumero();
        empleado1.getNombre();

        Consultor consul = new Consultor();

        consul.getNombre_consultora();
        consul.getNombre();

        //String Vector[] = new String[3];
        //Vector[0] = 1; No se mezclan tipos de datos

        Persona vector [] = new Persona[5];
        vector[0] = new Persona();
        vector[1] = new Empleado();
        vector[2] = new Consultor();
        vector[3] = new Jefe();
        
        Persona perso = new Persona();
        Consultor consultor = new Consultor ();

        perso = consul;

    }
}
