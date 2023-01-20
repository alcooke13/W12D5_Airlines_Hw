public class Pilot extends CrewMember {

    private String licenseNumber;


    public Pilot(String name, String rank, String licenseNumber){
        super(name, rank);
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber(){
        return this.licenseNumber;
    }

    public String flyPlane(){
        return "Cleared for take-off";
    }

}
