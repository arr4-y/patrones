 
package Prototype.Producto3;

 
public interface Producto extends Cloneable{
    
    void setNombre(String nombre);
    String getNombre();
    void setPrecio(double precio);
    double getPrecio();
    Producto clonar();
}
