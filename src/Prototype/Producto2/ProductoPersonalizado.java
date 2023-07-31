/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype.Producto2;

/**
 *
 * @author lenovo
 */
public class ProductoPersonalizado extends ProductoBase{
     private String personalizacion;

    public ProductoPersonalizado(String descripcion, String personalizacion) {
        super(descripcion);
        this.personalizacion = personalizacion;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " personalizado con: " + personalizacion;
    }
}
