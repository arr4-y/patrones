 
package Prototype.Producto;
 
public class ProductoDescuento extends ProductoBase {
     private double descuento;

    public ProductoDescuento(String nombre, double precio, String descripcion, String imagen, double descuento) {
        super(nombre, precio, descripcion, imagen);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public Producto clonar() {
        return new ProductoDescuento(getNombre(), getPrecio(), getDescripcion(), getImagen(), descuento);
    }
}
