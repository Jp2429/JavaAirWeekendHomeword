import java.util.ArrayList;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinMembers;
    private ArrayList<Passenger>passengers;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private int totalWeightAllowance;
    private int seatCapacity;

    public Flight(Pilot pilot,String flightNumber,String destination,String departureAirport,String departureTime,int totalWeightAllowance){
        this.pilot=pilot;
        this.cabinMembers=new ArrayList<CabinCrewMember>();
        this.passengers=new ArrayList<Passenger>();
        this.flightNumber=flightNumber;
        this.destination=destination;
        this.departureAirport=departureAirport;
        this.departureTime=departureTime;
        this.totalWeightAllowance=totalWeightAllowance;
        this.seatCapacity=25;

    }

    public Pilot getPilot() {
        return this.pilot;
    }

    public int getCabinMemberCount() {
        return this.cabinMembers.size();
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getTotalWeightAllowance() {
        return totalWeightAllowance;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void addCrew(CabinCrewMember cabinCrewMember){
        this.cabinMembers.add(cabinCrewMember);
    }

    public void bookPassenger(Passenger passenger) {
        if(this.passengers.size()<this.seatCapacity){
            this.passengers.add(passenger);
        }
    }

    public int getAvailableSeats() {
        return this.seatCapacity-this.passengers.size();
    }
}
