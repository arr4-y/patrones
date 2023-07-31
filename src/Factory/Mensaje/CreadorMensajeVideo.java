 
package Factory.Mensaje;

import Singleton.Conexion;

 
public class CreadorMensajeVideo extends CreadorMensaje {
   
        Conexion conexion = Conexion.obtenerInstancia();

    @Override
    public Mensaje crearMensaje() {
        return new MensajeVideo();
    }
    
}
