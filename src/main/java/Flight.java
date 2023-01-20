import java.util.ArrayList;

public class Flight {

    private String flightNumber;
    private String departureAirport;
    private String destinationAirport;
    private String departureTime;
    private Plane plane;
    private ArrayList<Passenger> listOfPassengers;
    private ArrayList<Pilot> listOfPilots;
    private ArrayList<CrewMember> listOfCrewMembers;

    public Flight(String flightNumber, String departureAirport, String destinationAirport, String departureTime, Plane plane){
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
        this.plane = plane;
        this.listOfPassengers = new ArrayList<Passenger>();
        this.listOfPilots = new ArrayList<Pilot>();
        this.listOfCrewMembers = new ArrayList<CrewMember>();

    }

}
