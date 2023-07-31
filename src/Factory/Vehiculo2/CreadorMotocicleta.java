/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory.Vehiculo2;

/**
 *
 * @author lenovo
 */
public class CreadorMotocicleta extends CreadorVehiculo {
    @Override
    public Vehiculo crearVehiculo() {
        return new Motocicleta();
    }
    
}
