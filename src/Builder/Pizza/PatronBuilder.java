package Builder.Pizza;

public class PatronBuilder {

    public static void main(String[] args) {
        // TODO code application logic here
        PizzaBuilder builder = new HawaiianPizzaBuilder();
        PizzaDirector director = new PizzaDirector();

        Pizza pizza = director.construirPizza(builder);
        pizza.describir();  // Pizza con masa de masa delgada, salsa de salsa de tomate y cobertura de jamón y piña.

    }

}
