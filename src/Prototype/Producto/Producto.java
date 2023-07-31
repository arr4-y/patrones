package Prototype.Producto;


public interface Producto extends Cloneable{
     void setNombre(String nombre);
    String getNombre();
    void setPrecio(double precio);
    double getPrecio();
    void setDescripcion(String descripcion);
    String getDescripcion();
    void setImagen(String imagen);
    String getImagen();
    Producto clonar();
}
