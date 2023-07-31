/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype.Documento;

/**
 *
 * @author lenovo
 */
public class DocumentoWord extends Documento {

    public DocumentoWord(String contenido) {
        super(contenido);
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo documento Word: " + contenido);
    }

}
