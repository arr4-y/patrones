/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder.Pizza2;
 
public class ChefDirector {
     public void construirPizzaAmericana(PizzaAmericanaBuilder constructor) {
        constructor.construirTamaño();
        constructor.construirMasa();
        constructor.construirSalsa();
        constructor.construirIngredientes();
    }

    public void construirPizzaPepperoni(PizzaPepperoniBuilder constructor) {
        constructor.construirTamaño();
        constructor.construirMasa();
        constructor.construirSalsa();
        constructor.construirIngredientes();
    }
}
