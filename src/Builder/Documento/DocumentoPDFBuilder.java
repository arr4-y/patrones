/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder.Documento;

/**
 *
 * @author lenovo
 */
public class DocumentoPDFBuilder implements DocumentoBuilder {

    private Documento documento;

    public DocumentoPDFBuilder() {
        this.documento = new Documento();

    }

    @Override
    public void construirTitulo() {
        documento.setTitulo("Documento PDF");

    }

    @Override
    public void construirContenido() {
        documento.setContenido("Contenido del documento en formato PDF");

    }

    @Override
    public void construirFormato() {
        documento.setFormato("PDF");

    }

    @Override
    public void construirPaginas() {
        documento.setPaginas(20);

    }

    @Override
    public Documento getDocumento() {
        return documento;
    }

}
