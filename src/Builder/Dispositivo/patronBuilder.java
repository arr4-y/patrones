 
package Builder.Dispositivo;
 
public class patronBuilder {
 
    public static void main(String[] args) {
        DispositivoDirector director = new DispositivoDirector();

        ComputadoraBuilder constructorComputadora = new ComputadoraBuilder();
        director.construirComputadora(constructorComputadora);
        Computadora computadora = constructorComputadora.getComputadora();
        computadora.describir();

        System.out.println("------------------------");

        TelefonoBuilder constructorTelefono = new TelefonoBuilder();
        director.construirTelefono(constructorTelefono);
        Telefono telefono = constructorTelefono.getTelefono();
        telefono.describir();
    }
    
}
