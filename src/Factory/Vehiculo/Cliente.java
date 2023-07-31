/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory.Vehiculo;
 
import java.util.ArrayList;
import java.util.List;

public class Cliente {
      private List<Vehiculo> flota;

    public Cliente() {
        flota = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        flota.add(vehiculo);
    }

    public List<Vehiculo> getFlota() {
        return flota;
    }
}
