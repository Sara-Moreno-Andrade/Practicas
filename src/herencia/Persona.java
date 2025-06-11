package herencia;

public class Persona {
    
    int id;
    String dni;
    String nombre;
    String apellido;
    String domicilio;
    String telefono;

    public Persona(){
    }

    public Persona(int id, String dni, String nombre, String apellido, String domicilio, String telefono){
    this.id = id;
    this.dni = dni;
    this.nombre = nombre;
    this.apellido = apellido;
    this.domicilio = domicilio;
    this.telefono = telefono;  
    }

    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }

    public String getDni(){
        return dni;
    }
    public void setDni(){
        this.dni = dni;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }
    public void setApellido(){
        this.apellido = apellido;
    }

    public String getDomicilio(){
        return domicilio;
    }
    public void setDomicilio(){
        this.domicilio = domicilio;
    }
}
