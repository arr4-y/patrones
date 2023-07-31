/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Factory.Vehiculo2;

/**
 *
 * @author lenovo
 */
public class AplicacionTransporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cliente utiliza un auto
        CreadorVehiculo creadorAuto = new CreadorAuto();
        Vehiculo auto = creadorAuto.crearVehiculo();
        auto.acelerar();

        // Cliente utiliza una motocicleta
        CreadorVehiculo creadorMotocicleta = new CreadorMotocicleta();
        Vehiculo motocicleta = creadorMotocicleta.crearVehiculo();
        motocicleta.acelerar();

        // Cliente utiliza una bicicleta eléctrica
        CreadorVehiculo creadorBicicletaElectrica = new CreadorBicicletaElectrica();
        Vehiculo bicicletaElectrica = creadorBicicletaElectrica.crearVehiculo();
        bicicletaElectrica.acelerar();
    }
    
}
