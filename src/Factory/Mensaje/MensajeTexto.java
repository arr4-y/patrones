/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory.Mensaje;

 
public class MensajeTexto implements Mensaje{
    
     @Override
    public void enviar() {
        System.out.println("Enviando un mensaje de texto.");
        // Lógica específica para enviar un mensaje de texto
    }
    
}
