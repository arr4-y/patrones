package Builder.Platillo;

public class patronBuilder {

    public static void main(String[] args) {
        CocineroDirector cocinero = new CocineroDirector();

        PlatilloBuilder constructorPizza = new PizzaBuilder();
        Pizza pizza = cocinero.cocinarPizza(constructorPizza);

        System.out.println("Descripción de la Pizza:");
        System.out.println(pizza.getDescripcion());

        System.out.println("------------------------");

        PlatilloBuilder constructorHamburguesa = new HamburguesaBuilder();
        Hamburguesa hamburguesa = cocinero.cocinarHamburguesa(constructorHamburguesa);

        System.out.println("Descripción de la Hamburguesa:");
        System.out.println(hamburguesa.getDescripcion());
        
    }

}
