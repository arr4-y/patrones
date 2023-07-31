package Builder.Documento;

public class DocumentoWordBuilder implements DocumentoBuilder {

    private Documento documento;

    public DocumentoWordBuilder() {
        this.documento =new  Documento();

    }

    @Override
    public void construirTitulo() {
        documento.setTitulo("Documento Word");

    }

    @Override
    public void construirContenido() {
        documento.setContenido("Contenido del documento en formato Word");

    }

    @Override
    public void construirFormato() {
        documento.setFormato("Word");

    }

    @Override
    public void construirPaginas() {
        documento.setPaginas(15);

    }

    @Override
    public Documento getDocumento() {
        return documento;
    }

}
