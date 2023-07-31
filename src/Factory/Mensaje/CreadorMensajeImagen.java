 
package Factory.Mensaje;

import Singleton.Conexion;
 
public class CreadorMensajeImagen extends CreadorMensaje {

    Conexion conexion = Conexion.obtenerInstancia();

    @Override
    public Mensaje crearMensaje() {
        return new MensajeImagen();
    }
}
