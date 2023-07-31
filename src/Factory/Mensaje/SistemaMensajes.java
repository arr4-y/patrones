/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Factory.Mensaje;

/**
 *
 * @author lenovo
 */
public class SistemaMensajes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cliente envía un mensaje de texto
        CreadorMensaje creadorMensajeTexto = new CreadorMensajeTexto();
        Mensaje mensajeTexto = creadorMensajeTexto.crearMensaje();
        mensajeTexto.enviar();

        // Cliente envía un mensaje de imagen
        CreadorMensaje creadorMensajeImagen = new CreadorMensajeImagen();
        Mensaje mensajeImagen = creadorMensajeImagen.crearMensaje();
        mensajeImagen.enviar();

        // Cliente envía un mensaje de video
        CreadorMensaje creadorMensajeVideo = new CreadorMensajeVideo();
        Mensaje mensajeVideo = creadorMensajeVideo.crearMensaje();
        mensajeVideo.enviar();
    }

}
