package Builder.Casa;

public class CasaFamiliarBuilder implements CasaBuilder {

    private Casa casa;

    public CasaFamiliarBuilder() {
        this.casa = new Casa();
    }

    @Override
    public void construirTipo() {
        casa.setTipo("Familiar");
    }

    @Override
    public void construirHabitaciones() {
        casa.setHabitaciones(3);
    }

    @Override
    public void construirBanios() {
        casa.setBanios(2);

    }

    @Override
    public void construirJardin() {
        casa.setTieneJardin(true);

    }

    @Override
    public void construirGaraje() {
        casa.setTieneGaraje(true);

    }

    @Override
    public Casa getCasa() {
        return casa;
    }

}
