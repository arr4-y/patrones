package Factory.FactoryFrutas;

import Singleton.Conexion;

public class FabricaPapaya extends FactoryFruta {

    Conexion conexion = Conexion.obtenerInstancia();

    @Override
    public Fruta crearFruta() {
        return new Papaya();
    }

}
