 
package Factory.FactoryFrutas;
 import Singleton.Conexion;

public class FabricaNaranja extends FactoryFruta {
    Conexion conexion= Conexion.obtenerInstancia();

    @Override
    public Fruta crearFruta() {
        return new Naranja(); 
    }
    
}
