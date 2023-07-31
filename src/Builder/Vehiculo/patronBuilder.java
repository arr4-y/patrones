 
package Builder.Vehiculo;
 
public class patronBuilder {

 
    public static void main(String[] args) {
         // Crear el director
        VehiculoDirector director = new VehiculoDirector();

/* 
        // Crear el builder de carro
        VehiculoBuilder constructorCarro = new CarroBuilder();
        director.construirCarro(constructorCarro);
        Carro carro = ((CarroBuilder) constructorCarro).obtenerResultado();
 */
        
        // Crear el builder de motocicleta
        VehiculoBuilder constructorMotocicleta = new MotocicletaBuilder();
        director.construirMotocicleta(constructorMotocicleta);
        Motocicleta motocicleta = ((MotocicletaBuilder) constructorMotocicleta).obtenerResultado();

        // Mostrar la información de los vehículos construidos
        System.out.println("Información del carro:");
      //  carro.mostrarInformacion();

        System.out.println();

        System.out.println("Información de la motocicleta:");
       motocicleta.mostrarInformacion();
    }
    
}
