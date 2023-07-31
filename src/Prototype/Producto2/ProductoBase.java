/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype.Producto2;

/**
 *
 * @author lenovo
 */
public class ProductoBase implements Producto {

    private String descripcion;

    public ProductoBase(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public Producto clonar() {
        try {
            return (Producto) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
