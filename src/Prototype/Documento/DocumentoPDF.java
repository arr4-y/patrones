 
package Prototype.Documento;
 
public class DocumentoPDF extends Documento
{
     public DocumentoPDF(String contenido) {
        super(contenido);
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo documento PDF: " + contenido);
    }
}
