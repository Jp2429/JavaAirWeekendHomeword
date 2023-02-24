public class Pilot extends CrewMember{
    private int pilotLicenceNumber;

    public Pilot(String name, CrewRank crewRank, int pilotLicenceNumber) {
        super(name, crewRank);
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public int getPilotLicenceNumber() {
        return pilotLicenceNumber;
    }

    public String flyPlane() {
        return "We have take off";
    }
}
