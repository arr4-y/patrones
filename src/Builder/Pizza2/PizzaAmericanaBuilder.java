 
package Builder.Pizza2;
 
import java.util.ArrayList;
import java.util.List;

public class PizzaAmericanaBuilder {
    private PizzaAmericana pizza;

    public PizzaAmericanaBuilder() {
        this.pizza = new PizzaAmericana();
    }

    public void construirTamaño() {
        pizza.setTamaño("Grande");
    }

    public void construirMasa() {
        pizza.setMasa("Gruesa");
    }

    public void construirSalsa() {
        pizza.setSalsa("Barbacoa");
    }

    public void construirIngredientes() {
        List<String> ingredientes = new ArrayList<>();
        ingredientes.add("Pepperoni");
        ingredientes.add("Cebolla");
        ingredientes.add("Queso");
        pizza.setIngredientes(ingredientes);
    }

    public PizzaAmericana getPizza() {
        return pizza;
    }
}
