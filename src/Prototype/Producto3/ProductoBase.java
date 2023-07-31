/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype.Producto3;

 
public class ProductoBase implements Producto{
    private String nombre;
    private double precio;

    public ProductoBase() {
        this.nombre = "Producto Base";
        this.precio = 10.0;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public Producto clonar() {
        return new ProductoBase();
    }
}
