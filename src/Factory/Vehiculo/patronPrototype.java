/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Factory.Vehiculo;

public class patronPrototype {

    public static void main(String[] args) {
        Vehiculo auto = new Auto("Toyota", "Corolla", 2022, 25000.0);
        Vehiculo autoClonado = auto.clonar();

        System.out.println("Auto:");
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modelo: " + auto.getModelo());
        System.out.println("Año: " + auto.getAnio());
        System.out.println("Precio: $" + auto.getPrecio());

        System.out.println("Auto Clonado:");
        System.out.println("Marca: " + autoClonado.getMarca());
        System.out.println("Modelo: " + autoClonado.getModelo());
        System.out.println("Año: " + autoClonado.getAnio());
        System.out.println("Precio: $" + autoClonado.getPrecio());

        System.out.println("----------");

        Vehiculo camion = new Camion("Ford", "F-150", 2022, 35000.0);
        Vehiculo camionClonado = camion.clonar();

        System.out.println("Camión:");
        System.out.println("Marca: " + camion.getMarca());
        System.out.println("Modelo: " + camion.getModelo());
        System.out.println("Año: " + camion.getAnio());
        System.out.println("Precio: $" + camion.getPrecio());

        System.out.println("Camión Clonado:");
        System.out.println("Marca: " + camionClonado.getMarca());
        System.out.println("Modelo: " + camionClonado.getModelo());
        System.out.println("Año: " + camionClonado.getAnio());
        System.out.println("Precio: $" + camionClonado.getPrecio());
    }

}
