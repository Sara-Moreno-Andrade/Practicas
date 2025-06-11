
public class Alumno{

    int id;
    String nombre;
    String apellido;

    public Alumno(){

    }
    public Alumno(int id, String nombre, String apellido){
        this.id = id ;
        this.nombre = nombre ;
        this.apellido = apellido;
    }
    
    //Abstraemos las características de Alumnos (atributos).

    public void mostrarNombre (){
        System.out.println("Hola, soy un alumno y se decir mi nombre:" + nombre);
    }

    public void saberAprobado (double calificacion){
        if(calificacion >= 6){
            System.out.println("Aprobé la materia.");
        }else{
            System.out.println("Suspendí la materia.");
        }
    }

}