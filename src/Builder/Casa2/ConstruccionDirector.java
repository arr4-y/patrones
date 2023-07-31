/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder.Casa2;

/**
 *
 * @author lenovo
 */
public class ConstruccionDirector {
    public void construirCasaBasica(CasaBuilder constructor) {
        constructor.construirCimientos();
        constructor.construirParedes();
        constructor.construirVentanas();
    }

    public void construirCasaLujo(CasaBuilder constructor) {
        constructor.construirCimientos();
        constructor.construirParedes();
        constructor.construirVentanas();
    }
}
