package Builder.Pizza2;

import java.util.ArrayList;
import java.util.List;

public class PizzaPepperoniBuilder {

    private PizzaPepperoni pizza;

    public PizzaPepperoniBuilder() {
        this.pizza = new PizzaPepperoni();
    }

    public void construirTamaño() {
        pizza.setTamaño("Mediana");
    }

    public void construirMasa() {
        pizza.setMasa("Delgada");
    }

    public void construirSalsa() {
        pizza.setSalsa("Tomate");
    }

    public void construirIngredientes() {
        List<String> ingredientes = new ArrayList<>();
        ingredientes.add("Pepperoni");
        ingredientes.add("Queso");
        pizza.setIngredientes(ingredientes);
    }

    public PizzaPepperoni getPizza() {
        return pizza;
    }
}
