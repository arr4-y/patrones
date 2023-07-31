 
package Factory.Vehiculo;

 
public interface Vehiculo extends Cloneable{
     void setMarca(String marca);
    String getMarca();
    void setModelo(String modelo);
    String getModelo();
    void setAnio(int anio);
    int getAnio();
    void setPrecio(double precio);
    double getPrecio();
    Vehiculo clonar();
}
