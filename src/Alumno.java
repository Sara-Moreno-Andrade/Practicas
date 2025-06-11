
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


    public int getId(){
        return id;
    }
    //Nos dice el valor del atributo
    public void setId(int id){
        this.id = id;
    }
    //No retorna valor solo establece al atributo
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

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