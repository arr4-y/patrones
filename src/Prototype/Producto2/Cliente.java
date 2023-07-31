/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype.Producto2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class Cliente {
    private List<Producto> productos;

    public Cliente() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto.getDescripcion());
        }
    }
}
