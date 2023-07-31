/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Singleton;

/**
 *
 * @author lenovo
 */
public class patronSingleton {

    public static void main(String[] args) {
        Conexion conexion = Conexion.obtenerInstancia();
        conexion.conectar();

        // Realizar operaciones en la base de datos
        conexion.desconectar();
    }

}
