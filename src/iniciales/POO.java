
public class POO {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno();
        //nombre de la clase del objeto + nombre variable + = + new nombre cosntructor (vacio)
        Alumno alumno2 = new Alumno(17, "Nikolas", "Vidal");
        //nombre de la clase del objeto + nombre variable + = + new nombre cosntructor (vacio)

        alumno1.setId(8); 
        alumno1.setNombre("Sara");
        alumno1.setApellido("Moreno");
        
        int id = alumno2.getId();
        System.out.println("La id del alumno 2 es:" + id);
        System.out.println("La id del alumno 2 es:" + alumno2.getNombre());
        System.out.println("La id del alumno 2 es:" + alumno2.getApellido());

        System.out.println();

        System.out.println("La id del alumno 1 es:" + alumno1.getId());
        System.out.println("La id del alumno 1 es:" + alumno1.getNombre());
        System.out.println("La id del alumno 1 es:" + alumno1.getApellido());
     
    }
}