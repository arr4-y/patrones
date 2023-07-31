 
package Builder.Casa;
 
public class CasaDirector {
    public Casa construirCasa(CasaBuilder builder) {
        builder.construirTipo();
        builder.construirHabitaciones();
        builder.construirBanios();
        builder.construirJardin();
        builder.construirGaraje();
        return builder.getCasa();
    }
}
