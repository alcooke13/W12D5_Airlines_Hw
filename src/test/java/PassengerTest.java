import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Jeff", 2);
    }

    @Test
    public void canGetName(){
        assertEquals("Jeff", passenger.getPassengerName());
    }

    @Test
    public void canGetPassengerBaggageCount(){
        assertEquals(2, passenger.getPassengerBaggageCount());
    }
}
