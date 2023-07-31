package Builder.Platillo;

import java.util.List;

public class Pizza {

    private String pan;
    private String masa;
    private String salsa;
    private List<String> ingredientes;
    private boolean tieneExtraQueso;

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }
    

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setTieneExtraQueso(boolean tieneExtraQueso) {
        this.tieneExtraQueso = tieneExtraQueso;
    }

    public String getDescripcion() {
    return "Pizza:\n" +
            "Masa: " + masa + "\n" +
            "Salsa: " + salsa + "\n" +
            "Ingredientes: " + ingredientes + "\n" +
            "Extra queso: " + (tieneExtraQueso ? "Sí" : "No");
}


}
