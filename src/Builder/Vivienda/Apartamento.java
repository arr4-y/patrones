 
package Builder.Vivienda;

 
public class Apartamento {
     private String tipo;
    private int numHabitaciones;
    private int numBanos;
    private boolean tieneBalcón;
    private boolean tienePiscina;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public void setNumBanos(int numBanos) {
        this.numBanos = numBanos;
    }

    public void setTieneBalcón(boolean tieneBalcón) {
        this.tieneBalcón = tieneBalcón;
    }

    public void setTienePiscina(boolean tienePiscina) {
        this.tienePiscina = tienePiscina;
    }

    public void describir() {
        System.out.println("Apartamento de tipo " + tipo + " con " + numHabitaciones + " habitaciones y " + numBanos + " baños.");
        System.out.println("Balcón: " + (tieneBalcón ? "Sí" : "No"));
        System.out.println("Piscina: " + (tienePiscina ? "Sí" : "No"));
    }
}
