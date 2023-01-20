import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilotJanet;

    @Before
    public void before(){
        pilotJanet = new Pilot("Janet", "Captain", "10671");
    }

    @Test
    public void canGetPilotName(){
        assertEquals("Janet", pilotJanet.getCrewMemberName());
    }

    @Test
    public void canGetPilotRank(){
        assertEquals("Captain", pilotJanet.getCrewMemberRank());
    }

    @Test
    public void canGetPilotLicenseNumber(){
        assertEquals("10671", pilotJanet.getLicenseNumber());
    }

    @Test
    public void canPilotFly(){
        assertEquals("Cleared for take-off", pilotJanet.flyPlane());
    }
}
