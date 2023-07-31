/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Prototype.Producto3;

import java.util.List;

public class patronPrototype {

    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        Producto productoBase = new ProductoBase();
        tienda.agregarProducto(productoBase);

        Producto productoPremium = new ProductoPremium();
        tienda.agregarProducto(productoPremium);

        List<Producto> inventario = tienda.getInventario();

        System.out.println("Inventario de la tienda:");

        for (Producto producto : inventario) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: $" + producto.getPrecio());
            System.out.println("-----");
        }
    }
}
