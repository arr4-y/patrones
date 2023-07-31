package Builder.Dispositivo;

public class DispositivoDirector {

    public void construirComputadora(ComputadoraBuilder constructor) {
        constructor.construirProcesador("Intel Core i7");
        constructor.construirMemoriaRAM(16);
        constructor.construirCapacidadAlmacenamiento(512);
        constructor.construirOpcional(true);
    }

    public void construirTelefono(TelefonoBuilder constructor) {
        constructor.construirMarca("Samsung");
        constructor.construirModelo("Galaxy S21");

        constructor.construirMemoriaRAM(8);
        constructor.construirCapacidadAlmacenamiento(128);
        constructor.construirOpcional(true);
    }
}
