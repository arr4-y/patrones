/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Prototype.Vehiculo;

import java.util.List;

public class patronPrototype {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Vehiculo auto = new Auto();
        cliente.agregarVehiculo(auto);

        Vehiculo camion = new Camion();
        cliente.agregarVehiculo(camion);

        List<Vehiculo> flota = cliente.getFlota();

        System.out.println("Flota de vehículos:");

        for (Vehiculo vehiculo : flota) {
            System.out.println("Marca: " + vehiculo.getMarca());
            System.out.println("Modelo: " + vehiculo.getModelo());
            System.out.println("Año: " + vehiculo.getAnio());
            System.out.println("Precio: $" + vehiculo.getPrecio());
            System.out.println("-----");
        }
    }

}
