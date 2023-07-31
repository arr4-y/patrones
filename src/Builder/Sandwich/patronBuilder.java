package Builder.Sandwich;

public class patronBuilder {

    public static void main(String[] args) {
       
        SandwichDirector hacedorSandwich = new SandwichDirector();

        SandwichPavoBuilder constructorSandwichPavo = new SandwichPavoBuilder();
        Sandwich sandwichPavo = hacedorSandwich.hacerSandwich(constructorSandwichPavo);
        sandwichPavo.describir();

        System.out.println("------------------------");

        SandwichBLTBuilder constructorSandwichBLT = new SandwichBLTBuilder();
        Sandwich sandwichBLT = hacedorSandwich.hacerSandwich(constructorSandwichBLT);
        sandwichBLT.describir();
    }

}
