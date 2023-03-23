package lab7;
import Clases.*;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * @author erick
 */
public class Lab7 {
    public static void main(String[] args) {
        Direccion direccion = new Direccion("Av Central","Metropolis", 30801, "USA");
        Empleado empleado = new Empleado("123", "Wally", "West","12345", direccion);
        
        Cliente cliente = new Cliente("Daily Panet", "Clark","Kent", "54321", direccion);
        
        TipoProducto  tipoProducto1 = new TipoProducto("Comestible", 1);
        TipoProducto  tipoProducto2 = new TipoProducto("Limpieza", 2);
        TipoProducto  tipoProducto3 = new TipoProducto("Bebidas f", 3);
        
        Producto producto1 = new Producto("Arroz entero", 3000, 20, tipoProducto1);
        Producto producto2 = new Producto("Jabon en polvo", 1500, 20, tipoProducto2);
        Producto producto3 = new Producto("Coca Cola Zero", 1400, 20, tipoProducto3);
         
        ArrayList<LineaFactura> detalle = new ArrayList<>();
        detalle.add(new LineaFactura(3, producto1));
        detalle.add(new LineaFactura(2, producto2));
        detalle.add(new LineaFactura(1, producto3));
        
        Factura factura = new Factura(123, Calendar.getInstance(), cliente, empleado, detalle);
        System.out.println(factura);
                
       
        
    }
    
}
