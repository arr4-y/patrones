/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder.Vivienda;

 
public class ViviendaDirector {
     public void construirCasa(ViviendaBuilder constructor) {
        constructor.construirTipo();
        constructor.construirNumHabitaciones();
        constructor.construirNumBanos();
        constructor.construirExtras();
    }

    public void construirApartamento(ViviendaBuilder constructor) {
        constructor.construirTipo();
        constructor.construirNumHabitaciones();
        constructor.construirNumBanos();
        constructor.construirExtras();
    }
}
