package Builder.Car;

public interface Builder {

    void setCarType(CarType type); //tipo

    void setSeats(int seats);//asientos

    void setEngine(Engine engine);//motor

    void setTransmission(Transmission transmission);//transmision

    void setTripComputer(TripComputer tripComputer);//computadoraViaje

    void setGPSNavigator(GPSNavigator gpsNavigator);//navegadorGPS
}
