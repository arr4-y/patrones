package Builder.Sandwich;

public class SandwichDirector {

    public Sandwich hacerSandwich(SandwichBuilder constructor) {
        constructor.construirPan();
        constructor.construirIngredientes();
        constructor.construirCondimentos();
        return constructor.getSandwich();
    }
}
