/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder.Casa2;

/**
 *
 * @author lenovo
 */
public class CasaBasicaBuilder implements CasaBuilder{
     private CasaBasica casa;

    public CasaBasicaBuilder() {
        this.casa = new CasaBasica();
    }

    @Override
    public void construirCimientos() {
        casa.setCimientos("Cimientos básicos construidos");
    }

    @Override
    public void construirParedes() {
        casa.setParedes("Paredes básicas construidas");
    }

    @Override
    public void construirVentanas() {
        casa.setVentanas("Ventanas básicas instaladas");
    }

    public CasaBasica obtenerCasa() {
        return casa;
    }
}
