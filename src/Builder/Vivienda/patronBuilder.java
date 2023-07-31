 
package Builder.Vivienda;

 
public class patronBuilder {

 
    public static void main(String[] args) {
       ViviendaDirector director = new ViviendaDirector();

        CasaBuilder constructorCasa = new CasaBuilder();
        director.construirCasa(constructorCasa);
        Casa casa = constructorCasa.obtenerResultado();
        casa.describir();

        System.out.println("------------------------");

        ApartamentoBuilder constructorApartamento = new ApartamentoBuilder();
        director.construirApartamento(constructorApartamento);
        Apartamento apartamento = constructorApartamento.obtenerResultado();
        apartamento.describir();
        
    }
    
}
