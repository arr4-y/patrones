 
package Builder.Documento;
 
public class patronBuilder {
 
    public static void main(String[] args) {
         DocumentoDirector director = new DocumentoDirector();

        DocumentoBuilder builder1 = new DocumentoPDFBuilder();
        Documento documento1 = director.construirDocumento(builder1);
        documento1.describir();

        System.out.println("------------------------");

        DocumentoBuilder builder2 = new DocumentoWordBuilder();
        Documento documento2 = director.construirDocumento(builder2);
        documento2.describir();
    }
    
}
