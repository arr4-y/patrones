 
package Builder.Dispositivo;
 
public class ComputadoraBuilder implements DispositivoBuilder {
    
    private Computadora computadora;

    public ComputadoraBuilder() {
        this.computadora = new Computadora();
    }

    @Override
    public void construirProcesador(String procesador) {
        computadora.setProcesador(procesador);
    }

    @Override
    public void construirMemoriaRAM(int memoriaRAM) {
        computadora.setMemoriaRAM(memoriaRAM);
    }

    @Override
    public void construirCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        computadora.setCapacidadAlmacenamiento(capacidadAlmacenamiento);
    }

    @Override
    public void construirOpcional(boolean tieneGPU) {
        computadora.setTieneGPU(tieneGPU);
    }

    public Computadora getComputadora() {
        return computadora;
    }
}
