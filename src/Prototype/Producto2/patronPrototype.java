 
package Prototype.Producto2;

 
public class patronPrototype {

 
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Producto productoBase = new ProductoBase("Producto base");
        Producto productoPersonalizado = new ProductoPersonalizado("Producto especial", "Personalización 1");

        cliente.agregarProducto(productoBase);
        cliente.agregarProducto(productoPersonalizado);

        cliente.mostrarProductos();

    }
    
}
