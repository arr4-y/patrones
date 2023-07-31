/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Prototype.Vehiculo;

/**
 *
 * @author lenovo
 */
public interface Vehiculo  extends Cloneable{
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
