public class CrewMember {

    private String name;

    private String rank;


    public CrewMember(String name, String rank){
        this.name = name;
        this.rank = rank;
    }

    public String getCrewMemberName(){
        return this.name;
    }

    public String getCrewMemberRank(){
        return this.rank;
    }

    public String talkToPassengers(){
        return "Welcome aboard this flight";
    }

}
