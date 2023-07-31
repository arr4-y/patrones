/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder.Vivienda;

/**
 *
 * @author lenovo
 */
public class CasaBuilder implements ViviendaBuilder{
    private Casa casa;

    public CasaBuilder() {
        this.casa = new Casa();
    }

    @Override
    public void construirTipo() {
        casa.setTipo("Familiar");
    }

    @Override
    public void construirNumHabitaciones() {
        casa.setNumHabitaciones(3);
    }

    @Override
    public void construirNumBanos() {
        casa.setNumBanos(2);
    }

    @Override
    public void construirExtras() {
        casa.setTieneJardin(true);
        casa.setTieneGaraje(true);
    }

    @Override
    public Casa obtenerResultado() {
        return casa;
    }
}
