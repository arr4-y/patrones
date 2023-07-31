package Builder.Platillo;

import java.util.List;

public interface PlatilloBuilder {

    void construirPan(String pan);

    void construirMasa(String masa);

    void construirSalsa(String salsa);

    void construirIngredientes(List<String> ingredientes);

    void construirToppings(boolean tieneExtra);

    Pizza getPizza();

    Hamburguesa getHamburguesa();

}
