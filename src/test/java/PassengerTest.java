import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    private Passenger passenger;

    @Before
    public void before(){
        passenger=new Passenger("Dave",3);
    }
    @Test
    public void canGetName(){
        assertEquals("Dave",passenger.getName());
    }
    @Test
    public void canGetNumOfBags(){
        assertEquals(3,passenger.getNumOfBags());
    }
}
