 
package Builder.Automovil;
 
public class Automovil {
    private String marca;
    private String modelo;
    private int año;
    private String motor;
    private String transmision;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
    
     public void describir() {
        System.out.println("Automóvil: " + marca + " " + modelo + " " + año);
        System.out.println("Motor: " + motor);
        System.out.println("Transmisión: " + transmision);
    }
    
}
