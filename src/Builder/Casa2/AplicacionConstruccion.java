/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Builder.Casa2;

 
public class AplicacionConstruccion {

   
    public static void main(String[] args) {
           ConstruccionDirector director = new ConstruccionDirector();

        // Construir una casa básica
        CasaBuilder constructorBasico = new CasaBasicaBuilder();
        director.construirCasaBasica(constructorBasico);
        CasaBasica casaBasica = ((CasaBasicaBuilder) constructorBasico).obtenerCasa();
        System.out.println(casaBasica.obtenerInformacionCasa());

        // Construir una casa de lujo
        CasaBuilder constructorLujo = new CasaLujoBuilder();
        director.construirCasaLujo(constructorLujo);
        CasaLujo casaLujo = ((CasaLujoBuilder) constructorLujo).obtenerCasa();
        System.out.println(casaLujo.obtenerInformacionCasa());
 
    }
    
}
