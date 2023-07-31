package Builder.Pizza;

import Singleton.Conexion;

public class HawaiianPizzaBuilder implements PizzaBuilder {

    private Pizza pizza;

    Conexion conexion = Conexion.obtenerInstancia();

    public HawaiianPizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void construirMasa() {
        pizza.setMasa("masa delgada");

    }

    @Override
    public void construirSalsa() {
        pizza.setSalsa("salsa de tomate");

    }

    @Override
    public void construirCobertura() {
        pizza.setCobertura("jamón y piña");

    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }

}
