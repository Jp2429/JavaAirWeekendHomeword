public class CabinCrewMember extends CrewMember{
    public CabinCrewMember(String name, CrewRank crewRank) {
        super(name, crewRank);
    }
    public String relayMessage(){
        return "Hello passengers";
    }
}
