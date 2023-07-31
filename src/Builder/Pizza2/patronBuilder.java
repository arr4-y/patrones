package Builder.Pizza2;

public class patronBuilder {

    public static void main(String[] args) {

        ChefDirector director = new ChefDirector();

        // Construir una Pizza Americana
        PizzaAmericanaBuilder constructorPizzaAmericana = new PizzaAmericanaBuilder();
        director.construirPizzaAmericana(constructorPizzaAmericana);
        PizzaAmericana pizzaAmericana = constructorPizzaAmericana.getPizza();
        pizzaAmericana.describir();

        System.out.println("------------------------");

        // Construir una Pizza Pepperoni
        PizzaPepperoniBuilder constructorPizzaPepperoni = new PizzaPepperoniBuilder();
        director.construirPizzaPepperoni(constructorPizzaPepperoni);
        PizzaPepperoni pizzaPepperoni = constructorPizzaPepperoni.getPizza();
        pizzaPepperoni.describir();

    }

}
