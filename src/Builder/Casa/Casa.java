 
package Builder.Casa;
 
public class Casa {
    
     private String tipo;
    private int habitaciones;
    private int banios;
    private boolean tieneJardin;
    private boolean tieneGaraje;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public void setBanios(int banios) {
        this.banios = banios;
    }

    public void setTieneJardin(boolean tieneJardin) {
        this.tieneJardin = tieneJardin;
    }

    public void setTieneGaraje(boolean tieneGaraje) {
        this.tieneGaraje = tieneGaraje;
    }

    public void describir() {
        System.out.println("Casa de tipo " + tipo + " con " + habitaciones + " habitaciones y " + banios + " baños.");
        System.out.println("Jardín: " + (tieneJardin ? "Sí" : "No"));
        System.out.println("Garaje: " + (tieneGaraje ? "Sí" : "No"));
    }
}
