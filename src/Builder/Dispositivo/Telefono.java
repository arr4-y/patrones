/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder.Dispositivo;

/**
 *
 * @author lenovo
 */
public class Telefono {
    private String marca;
    private String modelo;
    private int memoriaRAM;
    private int capacidadAlmacenamiento;
    private boolean tieneCamara;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public void setTieneCamara(boolean tieneCamara) {
        this.tieneCamara = tieneCamara;
    }

    public void describir() {
        System.out.println("Teléfono:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Memoria RAM: " + memoriaRAM + " GB");
        System.out.println("Capacidad de almacenamiento: " + capacidadAlmacenamiento + " GB");
        System.out.println("Tiene cámara: " + (tieneCamara ? "Sí" : "No"));
    }
}
