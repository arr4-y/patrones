/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype.Producto3;

import Singleton.Conexion;

 
public class ProductoPremium implements Producto {

    private String nombre;
    private double precio;

    Conexion conexion = Conexion.obtenerInstancia();

    public ProductoPremium() {
        this.nombre = "Producto Premium";
        this.precio = 20.0;
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
        return new ProductoPremium();
    }
}
