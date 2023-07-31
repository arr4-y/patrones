package Builder.Sandwich;

import java.util.ArrayList;
import java.util.List;

public class SandwichPavoBuilder implements SandwichBuilder {

    private Sandwich sandwich;

    public SandwichPavoBuilder() {
        this.sandwich = new Sandwich();
    }

    @Override
    public void construirPan() {
        sandwich.setPan("Trigo");
    }

    @Override
    public void construirIngredientes() {
        List<String> ingredientes = new ArrayList<>();
        ingredientes.add("Pavo");
        ingredientes.add("Queso");
        sandwich.setIngredientes(ingredientes);
    }

    @Override
    public void construirCondimentos() {
        sandwich.setTieneMayonesa(true);
        sandwich.setTieneMostaza(true);
        sandwich.setTieneLechuga(true);
    }

    @Override
    public Sandwich getSandwich() {
        return sandwich;
    }

}
