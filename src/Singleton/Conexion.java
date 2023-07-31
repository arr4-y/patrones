/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

public class Conexion {


    private static Conexion instancia;
    private String url;
    private String usuario;
    private String contraseña;

    private Conexion() {
        // Configuración de la conexión a la base de datos
        url = "jdbc:mysql://localhost:3306/mydatabase";
        usuario = "root";
        contraseña = "password";
    }

    public static Conexion obtenerInstancia() {
        if (instancia == null) {
            instancia = new Conexion();

        }
        return instancia;
    }

    public void conectar() {
        // Lógica para establecer la conexión a la base de datos
        System.out.println("Conectando a la base de datos...");
        System.out.println("URL: " + url);
        System.out.println("Usuario: " + usuario);
        System.out.println("Contraseña: " + contraseña);
        System.out.println("Conexión establecida.");
    }

    public void desconectar() {
        // Lógica para cerrar la conexión a la base de datos
        System.out.println("Desconectando de la base de datos...");
        System.out.println("Conexión cerrada.");
    }

    /*   
    public String value;

    private Conexion(String value) {
         try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Conexion getInstance(String value) {
        if (instance == null) {
            instance = new Conexion(value);
        }
        return instance;
    }
     */
}
