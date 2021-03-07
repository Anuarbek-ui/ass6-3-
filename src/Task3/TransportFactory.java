package Task3;

public class TransportFactory {

    public static Transport getTransport(Transports transportsType){
        if(transportsType == null){
            return null;
        }
        if(Transports.Ship == transportsType){
            return new Ship();

        } else if(transportsType == Transports.Truck){
            return new Truck();

        }
        return null;
    }
}
