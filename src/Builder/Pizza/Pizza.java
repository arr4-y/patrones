package Builder.Pizza;

public class Pizza {

    private String masa, salsa, cobertura;

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public void describir() {
        System.out.println("Pizza con masa de " + masa + ", salsa de " + salsa + " y cobertura de " + cobertura + ".");

    }

}
