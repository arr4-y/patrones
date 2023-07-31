/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype.Producto;
 
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private List<Producto> carrito;

    public Cliente() {
        carrito = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        carrito.add(producto);
    }

    public List<Producto> getCarrito() {
        return carrito;
    }
}
