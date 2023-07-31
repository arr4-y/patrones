/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder.Dispositivo;

/**
 *
 * @author lenovo
 */
public class TelefonoBuilder implements DispositivoBuilder {

    private Telefono telefono;

    public TelefonoBuilder() {
        this.telefono = new Telefono();
    }

    @Override
    public void construirProcesador(String procesador) {
        // No aplicable para teléfono
    }

    @Override
    public void construirMemoriaRAM(int memoriaRAM) {
        telefono.setMemoriaRAM(memoriaRAM);
    }

    @Override
    public void construirCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        telefono.setCapacidadAlmacenamiento(capacidadAlmacenamiento);
    }

    @Override
    public void construirOpcional(boolean tieneCamara) {
        telefono.setTieneCamara(tieneCamara);
    }
    
    public void construirMarca(String marca) {
        telefono.setMarca(marca);
    }

    public void construirModelo(String modelo) {
        telefono.setModelo(modelo);
    }

    public Telefono getTelefono() {
        return telefono;
    }
    
 
}
