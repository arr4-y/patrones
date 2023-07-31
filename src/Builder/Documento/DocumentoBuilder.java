package Builder.Documento;

public interface DocumentoBuilder {

    void construirTitulo();

    void construirContenido();

    void construirFormato();

    void construirPaginas();

    Documento getDocumento();
}
