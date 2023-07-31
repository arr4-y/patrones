/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype.Vehiculo;

public class Auto implements Vehiculo {

    private String marca;
    private String modelo;
    private int anio;
    private double precio;

    public Auto() {
        this.marca = "Toyota";
        this.modelo = "Corolla";
        this.anio = 2022;
        this.precio = 25000.0;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public int getAnio() {
        return anio;
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
    public Vehiculo clonar() {
        return new Auto();
    }

}
