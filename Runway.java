package FlightStuff;

import java.util.Scanner;

/**
 * Created by spencer.roth on 11/14/18.
 */
public class Runway {
    private boolean isOccupied;
    private final double lengthofOccupied = .5;
    private Flight occupier;

   public Runway(){
       setOccupied(false);
       setOccupier(null);
   }


    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public double getLengthofOccupied() {
        return lengthofOccupied;
    }

    public Flight getOccupier() {
        return occupier;
    }



    public void setOccupier(Flight occupier) {

        System.out.println("Please enter the admin password");
        Scanner scan = new Scanner (System.in);
        if(!scan.next().equals("password")){
            System.out.println("Page is loading...");
            return;
        }
        else{
            this.occupier = occupier;
        }
    }

}
