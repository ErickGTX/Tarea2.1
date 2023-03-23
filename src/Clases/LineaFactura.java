package Clases;
public class LineaFactura {
    int cantidad;
    double total;
    Producto producto;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        if(this.producto !=null)
            this.total = cantidad * this.producto.getValor();
    }

    public double getTotal() {
        return total;
    } 


    public Producto getPruducto() {
        return producto;
    }

    public void setPruducto(Producto pruducto) {
        this.producto = pruducto;
        if(cantidad > 0)
             this.total = cantidad * this.producto.getValor();
    }

    public LineaFactura(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.total = cantidad * this.producto.getValor();
    }

    public LineaFactura() {
    }

    @Override
    public String toString() {
        return this.producto + "\t" + cantidad + "\t\t" + total;
    }
    
}
