 
package Builder.Pizza;
 
public interface PizzaBuilder {
    void construirMasa();
    void construirSalsa();
    void construirCobertura();
    Pizza getPizza();
}
