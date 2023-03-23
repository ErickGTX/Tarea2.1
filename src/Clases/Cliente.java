
package Clases;
public class Cliente extends Persona{
    private String nombreCompannia;

    public String getNombreCompannia() {
        return nombreCompannia;
    }

    public void setNombreCompannia(String nombreCompannia) {
        this.nombreCompannia = nombreCompannia;
    }

    public Cliente(String nombreCompannia, String nombre, String apellidos, String cedula, Direccion direccion) {
        super(nombre, apellidos, cedula, direccion);
        this.nombreCompannia = nombreCompannia;
    }

    public Cliente() {
    }

    @Override
    public String toString() {
        return this.getNombre()
                +"\n" + this.nombreCompannia
                +"\nDireccion\n"
                + this.getDireccion() .getCiudad() + "," + this.getDireccion() .getCodigoPostal();
    }

  
    
}
