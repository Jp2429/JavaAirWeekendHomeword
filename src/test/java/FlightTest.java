import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private Pilot pilot;
    private CabinCrewMember cabinMember1;
    private CabinCrewMember cabinMember2;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Flight flight;

    @Before
    public void before(){
        pilot=new Pilot("John",CrewRank.CAPTAIN,1222);
        cabinMember1=new CabinCrewMember("Dave",CrewRank.FLIGHTATTENDANT);
        cabinMember2=new CabinCrewMember("Jim",CrewRank.FLIGHTATTENDANT);
        passenger1=new Passenger("Sam",2);
        passenger2=new Passenger("Holly",1);
        passenger3=new Passenger("Dan",3);
        flight=new Flight(pilot,"GRA2478","EDI","GLA","14:00",400);
        flight.addCrew(cabinMember1);
        flight.addCrew(cabinMember2);
    }
    @Test
    public void canGetPilot(){
        assertEquals(pilot,flight.getPilot());
    }
    @Test
    public void canGetFlightNumber(){
        assertEquals("GRA2478",flight.getFlightNumber());
    }
    @Test
    public void canGetDestination(){
        assertEquals("EDI",flight.getDestination());
    }
    @Test
    public void canGetDepartureAirport(){
        assertEquals("GLA",flight.getDepartureAirport());
    }
    @Test
    public void canGetDepartureTime(){
        assertEquals("14:00",flight.getDepartureTime());
    }
    @Test
    public void canGetTotalWeightAllowance(){
        assertEquals(400,flight.getTotalWeightAllowance());
    }
    @Test
    public void canGetSeatCapacity(){
        assertEquals(25,flight.getSeatCapacity());
    }
    @Test
    public void canGetCabinMemberCount(){
        assertEquals(2,flight.getCabinMemberCount());
    }
    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger1);
        assertEquals(1,flight.getPassengerCount());
    }
    @Test
    public void canReturnAvailableSeats(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        assertEquals(22,flight.getAvailableSeats());
    }
}
