import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;



public class FlightTest {
    private Flight flight;
    private Flight flightWithLowCapacityPlane;
    private Pilot pilotBob;
    private Pilot pilotJanet;

    private CrewMember crewMemberJohn;
    private CrewMember crewMemberLily;
    private CrewMember crewMemberSteph;


    private ArrayList<CrewMember> listOfCrewMembers;
    private ArrayList<Passenger> listOfPassengers;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;

    private Plane plane;
    private String flightNumber;
    private String departureAirport;
    private String destinationAirport;
    private String departureTime;

    @Before
    public void before(){
        //flight
        flight = new Flight("BA007", "EDI", "DXB", "17:05", Plane.A320);
        flightWithLowCapacityPlane = new Flight("0001", "EDI", "EDI", "12:00", Plane.SMALLPLANE);

        //Pilots
        pilotBob = new Pilot("Bob", "Captain", "2689");
        pilotJanet = new Pilot("Janet", "First Officer", "10671");

        //CrewMembers
        crewMemberJohn = new CrewMember("John", "Flight Attendant");
        crewMemberLily = new CrewMember("Lily", "Flight Attendant");
        crewMemberSteph = new CrewMember("Steph", "Flight Attendant");

        //PassengersOnBoardAircraft
        listOfPassengers = new ArrayList<Passenger>();

        //Passengers
        passenger1 = new Passenger("Jeff", 2);
        passenger2 = new Passenger("Stan", 1);
        passenger3 = new Passenger("Kate", 2);
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals("BA007", flight.getFlightNumber());
    }

    @Test
    public void canGetDepartureAirport(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void canGetDestinationAirport(){
        assertEquals("DXB", flight.getDestinationAirport());
    }

    @Test
    public void canGetDepartureTime(){
        assertEquals("17:05", flight.getDepartureTime());
    }

    @Test
    public void canGetEnumPlane(){
        assertEquals(Plane.A320, flight.getPlane());
    }

    @Test
    public void canGetPlaneType(){
        assertEquals("A320", flight.getPlaneType());
    }

    @Test
    public void canGetPlaneCapacity(){
        assertEquals(150, flight.getPlaneCapacity());
    }

    @Test
    public void canGetPlaneWeight(){
        assertEquals(6000, flight.getPlaneWeight());
    }


    @Test
    public void pilotCountStartsAt0(){
        assertEquals(0, flight.getPilotCount());
    }

    @Test
    public void canAddPilotToFlight(){
        flight.addPilotToFlight(pilotJanet);
        assertEquals(1, flight.getPilotCount());

    }

    @Test
    public void crewMemberCountStartsAt0(){
        assertEquals(0, flight.getCrewMemberCount());
    }


    @Test
    public void canAddCrewMembersToFlight(){
        flight.addCrewMemberToFlight(crewMemberLily);
        assertEquals(1, flight.getCrewMemberCount());
    }

    @Test
    public void passengerCountStartsAt0(){
        assertEquals(0, flight.getPassengerCount());
    }

    @Test
    public void canAddPassengerToFlight(){
        flight.addPassengerToFlight(passenger1);
        assertEquals(1, flight.getPassengerCount());
    }

    @Test
    public void cannotAddPassengerToFlightDueToCapacity(){
        flightWithLowCapacityPlane.addPassengerToFlight(passenger1);
        flightWithLowCapacityPlane.addPassengerToFlight(passenger2);
        flightWithLowCapacityPlane.addPassengerToFlight(passenger3);
        assertEquals(2, flightWithLowCapacityPlane.getPassengerCount());
    }

    @Test
    public void canGetNumberOfAvailableSeats(){
        flight.addPassengerToFlight(passenger1);
        flight.addPassengerToFlight(passenger2);
        flight.addPassengerToFlight(passenger3);
        assertEquals(147, flight.countAvailableSeats());
    }

}
