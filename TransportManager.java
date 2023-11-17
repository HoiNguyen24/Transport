import src.Ship;
import src.Transport;
import src.Transportable;
import java.util.Scanner;
public class TransportManager implements Transportable {
    private static String InfoEachTransport(Transport transport){
        return "Transport{" +
                "sourse='" + transport.getSourse() + '\'' +
                ", destination='" + transport.getDestination() + '\'' +
                ", distance=" + transport.getDistance() +'\'' +
                ", cost=" + transport.calculateCost() +
                '}';
    }
    @Override
    public void displayInfo(Transport[] transports, int n) {
                  for(int i = 0 ; i < n  ;i++){
                      if(transports[i] instanceof Transport){
                          System.out.println(InfoEachTransport(transports[i]));
                      }
                  }
    }


}
