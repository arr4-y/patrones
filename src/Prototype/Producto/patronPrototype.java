/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Prototype.Producto;

/**
 *
 * @author lenovo
 */
public class patronPrototype {
 
    public static void main(String[] args) {
        ProductoBase productoBase = new ProductoBase("Camiseta", 25.99, "Camiseta de algodón", "imagen_camiseta.png");
        ProductoBase productoBaseClonado = (ProductoBase) productoBase.clonar();

        System.out.println("Producto Base:");
        System.out.println("Nombre: " + productoBase.getNombre());
        System.out.println("Precio: $" + productoBase.getPrecio());
        System.out.println("Descripción: " + productoBase.getDescripcion());
        System.out.println("Imagen: " + productoBase.getImagen());

        System.out.println("----------");
        
        System.out.println("Producto Base Clonado:");
        System.out.println("Nombre: " + productoBaseClonado.getNombre());
        System.out.println("Precio: $" + productoBaseClonado.getPrecio());
        System.out.println("Descripción: " + productoBaseClonado.getDescripcion());
        System.out.println("Imagen: " + productoBaseClonado.getImagen());

        ProductoDescuento productoDescuento = new ProductoDescuento("Zapatos", 89.99, "Zapatos de cuero", "imagen_zapatos.png", 0.2);
        ProductoDescuento productoDescuentoClonado = (ProductoDescuento) productoDescuento.clonar();

        System.out.println("----------");
        
        System.out.println("Producto Descuento:");
        System.out.println("Nombre: " + productoDescuento.getNombre());
        System.out.println("Precio: $" + productoDescuento.getPrecio());
        System.out.println("Descripción: " + productoDescuento.getDescripcion());
        System.out.println("Imagen: " + productoDescuento.getImagen());
        System.out.println("Descuento: " + (productoDescuento.getDescuento() * 100) + "%");

        System.out.println("----------");
        
        System.out.println("Producto Descuento Clonado:");
        System.out.println("Nombre: " + productoDescuentoClonado.getNombre());
        System.out.println("Precio: $" + productoDescuentoClonado.getPrecio());
        System.out.println("Descripción: " + productoDescuentoClonado.getDescripcion());
        System.out.println("Imagen: " + productoDescuentoClonado.getImagen());
        System.out.println("Descuento: " + (productoDescuentoClonado.getDescuento() * 100) + "%");
    
        
    }
    
}
