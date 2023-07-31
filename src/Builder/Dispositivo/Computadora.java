 
package Builder.Dispositivo;
 
public class Computadora {
     private String procesador;
    private int memoriaRAM;
    private int capacidadAlmacenamiento;
    private boolean tieneGPU;

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public void setTieneGPU(boolean tieneGPU) {
        this.tieneGPU = tieneGPU;
    }

    public void describir() {
        System.out.println("Computadora:");
        System.out.println("Procesador: " + procesador);
        System.out.println("Memoria RAM: " + memoriaRAM + " GB");
        System.out.println("Capacidad de almacenamiento: " + capacidadAlmacenamiento + " GB");
        System.out.println("Tiene GPU: " + (tieneGPU ? "Sí" : "No"));
    }
}
