package Factory.FactoryFrutas;

public class FabricaDeFrutas {

    public static void main(String[] args) {
        FactoryFruta factory;

        String nombreFruta = "Naranja";

        if (nombreFruta.equals("Naranja")) {
            factory = new FabricaNaranja();
            factory.crearFruta().comer();
        }
        if (nombreFruta.equals("Papaya")) {
            factory = new FabricaPapaya();
            factory.crearFruta().comer();
        } else {
            factory = new FabricaMango();
            factory.crearFruta().comer();

        }
    }
}
