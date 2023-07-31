 
package Builder.Sandwich;
 
import java.util.List;

public class Sandwich {
    private String pan;
    private List<String> ingredientes;
    private boolean tieneMayonesa;
    private boolean tieneMostaza;
    private boolean tieneLechuga;

    public void setPan(String pan) {
        this.pan = pan;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setTieneMayonesa(boolean tieneMayonesa) {
        this.tieneMayonesa = tieneMayonesa;
    }

    public void setTieneMostaza(boolean tieneMostaza) {
        this.tieneMostaza = tieneMostaza;
    }

    public void setTieneLechuga(boolean tieneLechuga) {
        this.tieneLechuga = tieneLechuga;
    }

    public void describir() {
        System.out.println("Sándwich de pan " + pan);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Condimentos: " + (tieneMayonesa ? "Mayonesa " : "")
                + (tieneMostaza ? "Mostaza " : "") + (tieneLechuga ? "Lechuga" : ""));
    }
}
