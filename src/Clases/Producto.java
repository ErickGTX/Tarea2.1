package Clases;
public class Producto {
    private String descripcion;
    private double valor;
    private int stock; 
    private TipoProducto tipo;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public TipoProducto getTipo() {
        return tipo;
    }

    public void setTipo(TipoProducto tipo) {
        this.tipo = tipo;
    }

    public Producto() {
    }

    public Producto(String descripcion, double valor, int stock, TipoProducto tipo) {
        this.descripcion = descripcion;
        this.valor = valor;
        this.stock = stock;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return descripcion + "\t\t\t" + this.tipo.getDescripcion() + "\t" + valor;
    }
    
    
}
