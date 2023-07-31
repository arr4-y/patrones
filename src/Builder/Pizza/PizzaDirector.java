 
package Builder.Pizza;

 
public class PizzaDirector {
    public Pizza construirPizza(PizzaBuilder builder) {
        builder.construirMasa();
        builder.construirSalsa();
        builder.construirCobertura();
        return builder.getPizza();
    }
}
