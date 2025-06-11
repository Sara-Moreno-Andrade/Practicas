package herencia;

public class Empleado extends Persona {
    int num_legajo;
    String cargo;
    Double sueldo;

    public Empleado(){

    }

    public Empleado(int num_legajo, String cargo, Double sueldo, int id, String dni, String nombre, String apellido, String domicilio, String telefono){
        super(id, dni, nombre, apellido, domicilio, telefono);  
        this.num_legajo = num_legajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
    public int getNumero(){
        return num_legajo;
    }
    public void setNumero(){
        this.num_legajo = num_legajo;
    }

    public String getCargo(){
        return cargo;
    }
    public void setCargo(){
        this.cargo = cargo;
    }

    public Double getSueldo(){
        return sueldo;
    }
    public void setSueldo(){
        this.sueldo = sueldo;
    }

}
