package Builder.Automovil;

public class patronBuilder {

    public static void main(String[] args) {
        AutomovilBuilder builder = new SedanBuilder();
        AutomovilDirector director = new AutomovilDirector();

        Automovil automovil = director.construirAutomovil(builder);
        automovil.describir();
    }

}
