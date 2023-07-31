package Builder.Platillo;

import java.util.List;

public class Hamburguesa {

    private String pan;
    private List<String> ingredientes;
    private boolean tieneQueso;
    private boolean tieneLechuga;
    private boolean tieneTomate;

    public void setPan(String pan) {
        this.pan = pan;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setTieneQueso(boolean tieneQueso) {
        this.tieneQueso = tieneQueso;
    }

    public void setTieneLechuga(boolean tieneLechuga) {
        this.tieneLechuga = tieneLechuga;
    }

    public void setTieneTomate(boolean tieneTomate) {
        this.tieneTomate = tieneTomate;
    }

    /*
    public String getDescripcion() {
        return "Hamburguesa:\n"
                + "Pan: " + pan + "\n"
                + "Ingredientes: " + ingredientes + "\n"
                + "Queso: " + (tieneQueso ? "Sí" : "No") + "\n"
                + "Lechuga: " + (tieneLechuga ? "Sí" : "No") + "\n"
                + "Tomate: " + (tieneTomate ? "Sí" : "No");
    }
*/
     public String getDescripcion() {
        StringBuilder descripcion = new StringBuilder();
        descripcion.append("Hamburguesa:").append("\n");
        descripcion.append("Pan: ").append(pan).append("\n");
        descripcion.append("Ingredientes: ").append(ingredientes).append("\n");
        descripcion.append("Queso: ").append(tieneQueso ? "Sí" : "No").append("\n");
        descripcion.append("Lechuga: ").append(tieneLechuga ? "Sí" : "No").append("\n");
        descripcion.append("Tomate: ").append(tieneTomate ? "Sí" : "No").append("\n");
        return descripcion.toString();
    }
    

}
