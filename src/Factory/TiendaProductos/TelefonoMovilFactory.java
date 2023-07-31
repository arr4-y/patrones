/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory.TiendaProductos;

import Singleton.Conexion;



public class TelefonoMovilFactory extends ProductoFactory{
   
        Conexion conexion = Conexion.obtenerInstancia();

    
    @Override
    public Producto crearProducto() {
        return new TelefonoMovil();
    }
    
}
