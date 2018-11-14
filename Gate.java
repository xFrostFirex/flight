package FlightStuff;

/**
 * Created by spencer.roth on 11/14/18.
 */
public class Gate {
    private String name;
    private boolean isOccupied;
    private Flight occupier;

    public Gate(String n) {

        name = n;
        isOccupied = false;
        occupier = null;
    }

    public boolean sellTicket(){
        if (occupier != null){
            if(occupier.getSeatsFilled() < occupier.getCapacity()) {
                occupier.setSeatsFilled(occupier.getSeatsFilled() + 1);
                return true;
            }
        }
        return false;
    }
}
