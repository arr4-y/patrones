 
package Builder.Automovil;
 
public interface AutomovilBuilder {
    void construirMarca();
    void construirModelo();
    void construirAño();
    void construirMotor();
    void construirTransmision();
    Automovil getAutomovil();
}
