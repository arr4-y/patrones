/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory.TiendaProductos;

import Singleton.Conexion;

/**
 *
 * @author lenovo
 */
public class ComputadoraPortatilFactory extends ProductoFactory {

    Conexion conexion = Conexion.obtenerInstancia();

    @Override
    public Producto crearProducto() {
        return new ComputadoraPortatil();
    }
}
