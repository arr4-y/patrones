/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype.Producto3;

//cliente

import java.util.ArrayList;
import java.util.List;

public class Tienda {
     private List<Producto> inventario;

    public Tienda() {
        inventario = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }

    public List<Producto> getInventario() {
        return inventario;
    }
}
