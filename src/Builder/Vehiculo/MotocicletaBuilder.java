 
package Builder.Vehiculo;

 
public class MotocicletaBuilder implements VehiculoBuilder{
    private Motocicleta motocicleta;

    public MotocicletaBuilder() {
        this.motocicleta = new Motocicleta("", "", 0, "");
    }

    @Override
    public void establecerMarca(String marca) {
        motocicleta.marca = marca;
    }

    @Override
    public void establecerModelo(String modelo) {
        motocicleta.modelo = modelo;
    }

    @Override
    public void establecerAño(int año) {
        motocicleta.año = año;
    }

    @Override
    public void establecerColor(String color) {
        motocicleta.color = color;
    }

    public Motocicleta obtenerResultado() {
        return motocicleta;
    }
    
}
