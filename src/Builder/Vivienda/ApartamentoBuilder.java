/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder.Vivienda;

 
public class ApartamentoBuilder implements ViviendaBuilder{
    
    private Apartamento apartamento;

    public ApartamentoBuilder() {
        this.apartamento = new Apartamento();
    }

    @Override
    public void construirTipo() {
        apartamento.setTipo("Económico");
    }

    @Override
    public void construirNumHabitaciones() {
        apartamento.setNumHabitaciones(2);
    }

    @Override
    public void construirNumBanos() {
        apartamento.setNumBanos(1);
    }

    @Override
    public void construirExtras() {
        apartamento.setTieneBalcón(true);
        apartamento.setTienePiscina(false);
    }

    @Override
    public Apartamento obtenerResultado() {
        return apartamento;
    }
}
