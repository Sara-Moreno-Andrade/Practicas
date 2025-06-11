package herencia;

public class Consultor extends Persona {
    int num_consultora;
    String nombre_consultora;

    public Consultor(){

    }

    public Consultor(int num_consultora, String nombre_consultora, int id, String dni, String nombre, String apellido, String domicilio, String telefono){
        super(id, dni, nombre, apellido, domicilio, telefono);  
        this.nombre_consultora = nombre_consultora;
        this.num_consultora = num_consultora;
    }
    public int getNum_consultora(){
        return num_consultora;
    }
    public void setNum_consultora(){
        this.num_consultora = num_consultora;
    }

    public String getNombre_consultora(){
        return nombre_consultora;
    }
    public void setNombre_consultora(){
        this.nombre_consultora = nombre_consultora;
    }

}
