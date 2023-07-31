/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Factory.TiendaProductos;

/**
 *
 * @author lenovo
 */
public class TiendaEnLinea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cliente solicita un teléfono móvil
        ProductoFactory fabricaTelefonoMovil = new TelefonoMovilFactory();
        Producto telefonoMovil = fabricaTelefonoMovil.crearProducto();
        telefonoMovil.mostrarInformacion();

        // Cliente solicita una computadora portátil
        ProductoFactory fabricaComputadoraPortatil = new ComputadoraPortatilFactory();
        Producto computadoraPortatil = fabricaComputadoraPortatil.crearProducto();
        computadoraPortatil.mostrarInformacion();


    }
    
}
