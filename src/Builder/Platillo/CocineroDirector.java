 
package Builder.Platillo;
import java.util.Arrays;
 
public class CocineroDirector {
    public Pizza cocinarPizza(PlatilloBuilder constructor) {
        constructor.construirMasa("Delgada");
        constructor.construirSalsa("Tomate");
        constructor.construirIngredientes(Arrays.asList("Queso", "Pepperoni", "Aceitunas"));
        constructor.construirToppings(true);
        return constructor.getPizza();
    }

    public Hamburguesa cocinarHamburguesa(PlatilloBuilder constructor) {
        constructor.construirIngredientes(Arrays.asList("Carne de res", "Queso", "Lechuga", "Tomate"));
        constructor.construirToppings(false);
        return constructor.getHamburguesa();
    }
}
