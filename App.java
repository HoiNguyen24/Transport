import src.Airplane;
import src.Ship;
import src.Transport;
import src.Truck;

public class App {
    private static void InputTransport(Transport[] transports){
        transports[0] = new Ship("dong anh","bac tu liem",130.0);
        transports[1] = new Airplane("dong anh","tp hcm",1000.0);
        transports[2] = new Truck("dong anh","da lat",700);
    }
    public static void main(String[] args) {
        TransportManager transportManager = new TransportManager();
        Transport[] transports = new Transport[20];
        InputTransport(transports);
        transportManager.displayInfo(transports, transports.length);
    }
}