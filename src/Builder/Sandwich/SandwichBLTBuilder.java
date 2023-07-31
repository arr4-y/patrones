package Builder.Sandwich;

import java.util.ArrayList;
import java.util.List;

public class SandwichBLTBuilder implements SandwichBuilder {

    private Sandwich sandwich;

    public SandwichBLTBuilder() {
        this.sandwich = new Sandwich();
    }

    @Override
    public void construirPan() {
        sandwich.setPan("Blanco");

    }

    @Override
    public void construirIngredientes() {
        List<String> ingredientes = new ArrayList<>();
        ingredientes.add("Bacon");
        ingredientes.add("Lechuga");
        ingredientes.add("Tomate");
        sandwich.setIngredientes(ingredientes);
    }

    @Override
    public void construirCondimentos() {
        sandwich.setTieneMayonesa(true);

    }

    @Override
    public Sandwich getSandwich() {
        return sandwich;

    }

}
