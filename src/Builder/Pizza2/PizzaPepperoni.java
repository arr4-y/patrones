package Builder.Pizza2;

import java.util.List;

public class PizzaPepperoni {

    private String tamaño;
    private String masa;
    private String salsa;
    private List<String> ingredientes;

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void describir() {
        System.out.println("Pizza Pepperoni de tamaño " + tamaño);
        System.out.println("Masa: " + masa);
        System.out.println("Salsa: " + salsa);
        System.out.println("Ingredientes: " + ingredientes);
    }
}
