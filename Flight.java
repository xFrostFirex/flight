package FlightStuff;
import java.util.Scanner;

/**
 * Created by spencer.roth on 11/14/18.
 */
public class Flight {


    private double departureTime;
    private double arrivalTime;
    private int capacity;
    private String destination;
    private int seatsFilled;
    private double cost;

    public Flight (int c, String de, double co){
        setCapacity(c);
        destination = de;
        setSeatsFilled(0);
        cost = co;
    }

    public double getArrivalTime() {return arrivalTime;}

    public void scheduleArrival(double time) {
        System.out.println("Please enter the admin password");
        Scanner scan = new Scanner(System.in);
        if (!scan.next().equals("password")) {
            System.out.println("Page is loading...");
            return;
        } else {
            arrivalTime = time;
        }
    }


    public void scheduleDeparture(double time){
        System.out.println("Please enter the admin password");
        Scanner scan = new Scanner (System.in);
        if(!scan.next().equals("password")){
            System.out.println("Page is loading...");
            return;
        }
        else{
            departureTime = time;
        }
    }

    public double getDepartureTime(){return departureTime;}

    public int getSeatsFilled() {
        return seatsFilled;
    }

    public void setSeatsFilled(int seatsFilled) {
        this.seatsFilled = seatsFilled;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
