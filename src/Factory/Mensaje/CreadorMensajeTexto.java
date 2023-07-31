 
package Factory.Mensaje;

import Singleton.Conexion;
 
public class CreadorMensajeTexto extends CreadorMensaje {

    Conexion conexion = Conexion.obtenerInstancia();

    @Override
    public Mensaje crearMensaje() {
        return new MensajeTexto();
    }
}
