package FlightStuff;

/**
 * Created by spencer.roth on 11/14/18.
 */
public class FlightMain {
    public static void main(String[] args) {
        Flight f = new Flight (10,"Billings",700);
        f.scheduleArrival(3.00);
        System.out.println("Your plane is arriving at " + f.getArrivalTime());
    }
}
