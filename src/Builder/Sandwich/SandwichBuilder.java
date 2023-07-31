 
package Builder.Sandwich;

 
public interface SandwichBuilder {
    void construirPan();
    void construirIngredientes();
    void construirCondimentos();
    Sandwich getSandwich();
}
