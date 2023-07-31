 
package Builder.Automovil;
 
public class AutomovilDirector {
    public Automovil construirAutomovil(AutomovilBuilder builder){
        builder.construirMarca();
        builder.construirModelo();
        builder.construirAño();
        builder.construirMotor();
        builder.construirTransmision();
        return builder.getAutomovil();
    }
    
}
