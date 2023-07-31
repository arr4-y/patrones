 
package Builder.Vivienda;

 
public interface ViviendaBuilder {
     void construirTipo();
    void construirNumHabitaciones();
    void construirNumBanos();
    void construirExtras();
    Object obtenerResultado();
}
