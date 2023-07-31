package Builder.Casa;

public class patronBuilder {

    public static void main(String[] args) {
        CasaBuilder builder = new CasaFamiliarBuilder();
        CasaDirector director = new CasaDirector();

        Casa casa = director.construirCasa(builder);
        casa.describir();

    }

}
