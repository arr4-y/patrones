package Factory.FactoryFrutas;


import Singleton.Conexion;
public class FabricaMango extends FactoryFruta {

    Conexion conexion = Conexion.obtenerInstancia();
    //        Database foo = Database.getInstance()
    @Override
    public Fruta crearFruta() {
        return new Mango();
    }

}
