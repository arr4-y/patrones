/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory.Mensaje;

import Singleton.Conexion;

/**
 *
 * @author lenovo
 */
public class MensajeVideo implements Mensaje{
    
 
    @Override
    public void enviar() {
        System.out.println("Enviando un mensaje de video.");
        // Lógica específica para enviar un mensaje de video
    }
}
