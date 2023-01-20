import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CrewMemberTest {

    private CrewMember flightAttendantBob;

    @Before
    public void before(){
        flightAttendantBob = new CrewMember("Bob", "Flight Attendant");
    }

    @Test
    public void canGetFlightAttendantName(){
        assertEquals("Bob", flightAttendantBob.getCrewMemberName());
    }

    @Test
    public void canGetFlightAttendantRank(){
        assertEquals("Flight Attendant", flightAttendantBob.getCrewMemberRank());
    }

    @Test
    public void canCrewMemberTalkToPassengers(){
        assertEquals("Welcome aboard this flight", flightAttendantBob.talkToPassengers());
    }


}
