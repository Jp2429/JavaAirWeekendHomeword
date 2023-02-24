import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    private CabinCrewMember cabinMember;

    @Before
    public void before(){
        cabinMember=new CabinCrewMember("Peter",CrewRank.FLIGHTATTENDANT);
    }
    @Test
    public void canGetName(){
        assertEquals("Peter",cabinMember.getName());
    }
    @Test
    public void canGetRankValue(){
        assertEquals("flight attendant",cabinMember.getCrewRankValue());
    }
    @Test
    public void canRelayMessage(){
        assertEquals("Hello passengers",cabinMember.relayMessage());
    }
}
