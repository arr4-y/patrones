package Builder.Platillo;

import java.util.List;

public class HamburguesaBuilder implements PlatilloBuilder {

    private String pan;

    private Hamburguesa hamburguesa;

    public HamburguesaBuilder() {
        this.pan = "Sesame";

        this.hamburguesa = new Hamburguesa();
    }

    @Override
    public void construirMasa(String masa) {
    }

    @Override
    public void construirSalsa(String salsa) {
    }

    @Override
    public void construirIngredientes(List<String> ingredientes) {
        hamburguesa.setIngredientes(ingredientes);
    }

    @Override
    public void construirToppings(boolean tieneExtra) {
        hamburguesa.setTieneQueso(tieneExtra);
    }

    @Override
    public Pizza getPizza() {
        return null;
    }

    @Override
    public Hamburguesa getHamburguesa() {
        hamburguesa.setPan(pan);
        return hamburguesa;
    }

    @Override
    public void construirPan(String pan) {
        this.pan = pan;
    }
}
