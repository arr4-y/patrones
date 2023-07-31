/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype.Documento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class RegistroDocumentos {
    private static List<Documento> listaDocumentos = new ArrayList<>();

    public static void registrarDocumento(Documento documento) {
        listaDocumentos.add(documento);
    }

    public static Documento crearDocumento(String tipo, String contenido) throws CloneNotSupportedException {
        for (Documento documento : listaDocumentos) {
            if (documento.getClass().getSimpleName().equals(tipo)) {
                Documento documentoClonado = (Documento) documento.clone();
                documentoClonado.contenido = contenido;
                return documentoClonado;
            }
        }
        return null;
    }
}
