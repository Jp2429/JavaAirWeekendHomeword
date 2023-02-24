import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    private Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("John",CrewRank.CAPTAIN,1234);
    }
    @Test
    public void canGetName(){
        assertEquals("John",pilot.getName());
    }
    @Test
    public void canGetRankValue(){
        assertEquals("captain",pilot.getCrewRankValue());
    }
    @Test
    public void canGetPilotLicenceNumber(){
        assertEquals(1234,pilot.getPilotLicenceNumber());
    }
    @Test
    public void canFlyPlane(){
        assertEquals("We have take off",pilot.flyPlane());
    }
}
