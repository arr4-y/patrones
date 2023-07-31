package Builder.Dispositivo;

public interface DispositivoBuilder {

    void construirProcesador(String procesador);

    void construirMemoriaRAM(int memoriaRAM);

    void construirCapacidadAlmacenamiento(int capacidadAlmacenamiento);

    void construirOpcional(boolean opcional);

 }
