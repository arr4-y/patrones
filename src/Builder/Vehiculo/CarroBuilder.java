package Builder.Vehiculo;

public class CarroBuilder implements VehiculoBuilder {

    private Carro carro;

    public CarroBuilder() {
        this.carro = new Carro("", "", 0, "");
    }

    public Carro obtenerResultado() {
        return carro;
    }

    @Override
    public void establecerMarca(String marca) {
        carro.marca = marca;
    }

    @Override
    public void establecerModelo(String modelo) {
        carro.modelo = modelo;
    }

    @Override
    public void establecerAño(int año) {
        carro.año = año;
    }

    @Override
    public void establecerColor(String color) {
        carro.color = color;
    }
}
