/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory.TiendaProductos;

/**
 *
 * @author lenovo
 */
public class TelefonoMovil implements Producto{
    @Override
    public void mostrarInformacion() {
        System.out.println("Este es un teléfono móvil.");
        // Lógica específica para mostrar información de un teléfono móvil
    }
}
