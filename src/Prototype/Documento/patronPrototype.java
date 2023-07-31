/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Prototype.Documento;

public class patronPrototype {

    public static void main(String[] args) {
        // Registrar los prototipos de documentos en el registro
        RegistroDocumentos.registrarDocumento(new DocumentoPDF(null));
        RegistroDocumentos.registrarDocumento(new DocumentoWord(null));

        try {
            // Crear un documento PDF clonado y establecer su contenido
            Documento documentoPdfClonado = RegistroDocumentos.crearDocumento("DocumentoPdf", "Contenido del PDF");
            if (documentoPdfClonado != null) {
                documentoPdfClonado.imprimir();
            }

            // Crear un documento Word clonado y establecer su contenido
            Documento documentoWordClonado = RegistroDocumentos.crearDocumento("DocumentoWord", "Contenido del Word");
            if (documentoWordClonado != null) {
                documentoWordClonado.imprimir();
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
    }

}
