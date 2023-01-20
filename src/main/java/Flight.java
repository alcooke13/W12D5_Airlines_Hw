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

    public String getFlightNumber(){
        return this.flightNumber;
    }

    public String getDepartureAirport(){
        return this.departureAirport;
    }

    public String getDestinationAirport(){
        return this.destinationAirport;
    }

    public String getDepartureTime(){
        return this.departureTime;
    }

    public Plane getPlane(){
        return this.plane;
    }

    public String getPlaneType(){
        Plane airplane = this.getPlane();
        return airplane.getPlaneType();
    }

    public int getPlaneCapacity(){
        Plane airplane = this.getPlane();
        return airplane.getPlaneTotalCapacity();
    }

    public int getPlaneWeight(){
        Plane airplane = this.getPlane();
        return airplane.getPlaneWeight();
    }

    public int getPilotCount(){
        return this.listOfPilots.size();
    }

    public void addPilotToFlight(Pilot pilotToAdd){
        this.listOfPilots.add(pilotToAdd);
    }

    public int getCrewMemberCount(){
        return this.listOfCrewMembers.size();
    }

    public void addCrewMemberToFlight(CrewMember crewToAdd){
        this.listOfCrewMembers.add(crewToAdd);
    }

    public int getPassengerCount(){
        return this.listOfPassengers.size();
    }

    public void addPassengerToFlight(Passenger passengerToAdd){
        int totalCapacity = this.getPlaneCapacity();
        if(totalCapacity - this.getPassengerCount() > 0){
            listOfPassengers.add(passengerToAdd);
        }
    }

    public int countAvailableSeats(){
        int totalCapacity = this.getPlaneCapacity();
        return totalCapacity - this.getPassengerCount();
    }



}
