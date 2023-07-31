
package Builder.Documento;
 
public class DocumentoDirector {
    public Documento construirDocumento(DocumentoBuilder builder) {
        builder.construirTitulo();
        builder.construirContenido();
        builder.construirFormato();
        builder.construirPaginas();
        return builder.getDocumento();
    }
}
