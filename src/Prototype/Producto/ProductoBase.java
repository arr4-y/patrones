/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype.Producto;

/**
 *
 * @author lenovo
 */
public class ProductoBase implements Producto{
    private String nombre;
    private double precio;
    private String descripcion;
    private String imagen;

    public ProductoBase(String nombre, double precio, String descripcion, String imagen) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.imagen = imagen;
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
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String getImagen() {
        return imagen;
    }

    @Override
    public Producto clonar() {
        return new ProductoBase(nombre, precio, descripcion, imagen);
    }
}
