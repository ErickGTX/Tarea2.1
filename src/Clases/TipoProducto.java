package Clases;
public class TipoProducto  {
    private String descripcion;
    private int codigo; 

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public TipoProducto(String descripcion, int codigo) {
        this.descripcion = descripcion;
        this.codigo = codigo;
    }

    public TipoProducto() {
    }

    @Override
    public String toString() {
        return "TipoProducto{" + "descripcion=" + descripcion + ", codigo=" + codigo + '}';
    }

    
    
}
