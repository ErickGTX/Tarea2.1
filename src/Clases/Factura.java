
package Clases;

import java.util.ArrayList;
import java.util.Calendar;

public class Factura {
    int numeroFactura;
    Calendar fecha;
    double total; 
    Cliente cliente;
    Persona empleado;
    ArrayList<LineaFactura> detalle;

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Persona getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Persona empleado) {
        this.empleado = empleado;
    }

    public ArrayList<LineaFactura> getDetalle() {
        return detalle;
    }

    public void setDetalle(ArrayList<LineaFactura> detalle) {
        this.detalle = detalle;
        if(detalle != null){
            for (LineaFactura lineaFactura : detalle){
            this.total += lineaFactura.getTotal();
            }
        }
    }

    public Factura(int numeroFactura, Calendar fecha, Cliente cliente, Persona empleado, ArrayList<LineaFactura> detalle) {
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.cliente = cliente;
        this.empleado = empleado;
        this.detalle = detalle;
        if(detalle != null){
            for (LineaFactura lineaFactura : detalle){
            this.total += lineaFactura.getTotal();
            }
        }
        
    }
    public Factura() {
    }
    public String impresionDetalle(){
        String todoElDetalle = "PRODUCTO\t\t\tTIPO\t\tVALOR\tCANTIDAD\tTOTAL\n";
        if(detalle != null){
            for (LineaFactura lineaFactura : detalle){
            todoElDetalle += lineaFactura + "\n";
            }
        }
        return todoElDetalle;
    }

    @Override
    public String toString() {
        return this.empleado.getNombre() + "\t\t\t\tFACTURA\n\n"
                + "\t\t\t\t\t" + this.numeroFactura + "\n"
                + "\t\t\t\t\t" + this.fecha.getTime() + "\n\n"
                + this.cliente + "\n\n"
                + this.impresionDetalle()
                + "\t\t\t\t\t\t\tTOTAL\t" + this.total + "\n\n"
                + "\t\tGracias por la pizza y las hamburguesas";
                
    }
    
}
