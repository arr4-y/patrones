package Builder.Platillo;

import java.util.List;

public class PizzaBuilder implements PlatilloBuilder {

     private Pizza pizza;

    public PizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void construirMasa(String masa) {
        pizza.setMasa(masa);
    }

    @Override
    public void construirSalsa(String salsa) {
        pizza.setSalsa(salsa);
    }

    @Override
    public void construirIngredientes(List<String> ingredientes) {
        pizza.setIngredientes(ingredientes);
    }

    @Override
    public void construirToppings(boolean tieneExtra) {
        pizza.setTieneExtraQueso(tieneExtra);
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }

    @Override
    public Hamburguesa getHamburguesa() {
        return null;
    }

    @Override
    public void construirPan(String pan) {
        pizza.setPan(pan);
    }

}
