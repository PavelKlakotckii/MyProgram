import com.skillbox.airport.Airport;

public class Main {
    public static void main(String[] args) {
        Airport aeroport = Airport.getInstance();
        aeroport.getAllAircrafts();
        System.out.println(aeroport.getAllAircrafts().size());
    }
}
