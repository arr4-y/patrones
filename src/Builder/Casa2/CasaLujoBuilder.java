/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder.Casa2;

/**
 *
 * @author lenovo
 */
public class CasaLujoBuilder implements CasaBuilder{
    private CasaLujo casa;

    public CasaLujoBuilder() {
        this.casa = new CasaLujo();
    }

    @Override
    public void construirCimientos() {
        casa.setCimientos("Cimientos de lujo construidos");
    }

    @Override
    public void construirParedes() {
        casa.setParedes("Paredes de lujo construidas");
    }

    @Override
    public void construirVentanas() {
        casa.setVentanas("Ventanas de lujo instaladas");
    }

    
    public CasaLujo obtenerCasa() {
        return casa;
    }
}
