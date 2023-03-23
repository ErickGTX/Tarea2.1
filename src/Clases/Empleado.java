package Clases;
public class Empleado extends Persona {
    private String codigo; 

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Empleado(String codigo, String nombre, String apellidos, String cedula, Direccion direccion) {
        super(nombre, apellidos, cedula, direccion);
        this.codigo = codigo;
    }

    public Empleado() {
    }

    @Override
    public String toString() {
        return "Empleado{" + "codigo=" + codigo + '}' + super.toString();
    }
    
    
}
