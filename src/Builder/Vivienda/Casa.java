 
package Builder.Vivienda;
 
public class Casa {
    private String tipo;
    private int numHabitaciones;
    private int numBanos;
    private boolean tieneJardin;
    private boolean tieneGaraje;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public void setNumBanos(int numBanos) {
        this.numBanos = numBanos;
    }

    public void setTieneJardin(boolean tieneJardin) {
        this.tieneJardin = tieneJardin;
    }

    public void setTieneGaraje(boolean tieneGaraje) {
        this.tieneGaraje = tieneGaraje;
    }

    public void describir() {
        System.out.println("Casa de tipo " + tipo + " con " + numHabitaciones + " habitaciones y " + numBanos + " baños.");
        System.out.println("Jardín: " + (tieneJardin ? "Sí" : "No"));
        System.out.println("Garaje: " + (tieneGaraje ? "Sí" : "No"));
    }
}
