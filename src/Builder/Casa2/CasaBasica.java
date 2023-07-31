/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder.Casa2;

/**
 *
 * @author lenovo
 */
public class CasaBasica {
     private String cimientos;
    private String paredes;
    private String ventanas;

    public void setCimientos(String cimientos) {
        this.cimientos = cimientos;
    }

    public void setParedes(String paredes) {
        this.paredes = paredes;
    }

    public void setVentanas(String ventanas) {
        this.ventanas = ventanas;
    }

    public String obtenerInformacionCasa() {
        return "Casa Básica:\n" +
                "Cimientos: " + cimientos + "\n" +
                "Paredes: " + paredes + "\n" +
                "Ventanas: " + ventanas;
    }
}
