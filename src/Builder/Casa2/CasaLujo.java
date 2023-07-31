/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder.Casa2;

/**
 *
 * @author lenovo
 */
public class CasaLujo {
    private String cimientos;
    private String paredes;
    private String ventanas;
    private String piscina;
    private String jardin;

    public void setCimientos(String cimientos) {
        this.cimientos = cimientos;
    }

    public void setParedes(String paredes) {
        this.paredes = paredes;
    }

    public void setVentanas(String ventanas) {
        this.ventanas = ventanas;
    }

    public void setPiscina(String piscina) {
        this.piscina = piscina;
    }

    public void setJardin(String jardin) {
        this.jardin = jardin;
    }

    public String obtenerInformacionCasa() {
        return "Casa de Lujo:\n" +
                "Cimientos: " + cimientos + "\n" +
                "Paredes: " + paredes + "\n" +
                "Ventanas: " + ventanas + "\n" +
                "Piscina: " + piscina + "\n" +
                "Jardín: " + jardin;
    }
}
