package Builder.Automovil;

public class SedanBuilder implements AutomovilBuilder {

    private Automovil automovil;

    public SedanBuilder() {
        this.automovil = new Automovil();
    }

    @Override
    public void construirMarca() {
        automovil.setMarca("Toyota");

    }

    @Override
    public void construirModelo() {
        automovil.setModelo("Corolla");

    }

    @Override
    public void construirAño() {
        automovil.setAño(2022);

    }

    @Override
    public void construirMotor() {
        automovil.setMotor("1.8L");

    }

    @Override
    public void construirTransmision() {
        automovil.setTransmision("Automática");

    }

    @Override
    public Automovil getAutomovil() {
        return automovil;
    }

}
