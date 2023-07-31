 
package Builder.Vehiculo;

 
public class VehiculoDirector {
    public void construirCarro(VehiculoBuilder constructor) {
        constructor.establecerMarca("Toyota");
        constructor.establecerModelo("Corolla");
        constructor.establecerAño(2022);
        constructor.establecerColor("Rojo");
    }
    public void construirMotocicleta(VehiculoBuilder constructor) {
        constructor.establecerMarca("Honda");
        constructor.establecerModelo("CBR500R");
        constructor.establecerAño(2021);
        constructor.establecerColor("Negro");
    }
}
