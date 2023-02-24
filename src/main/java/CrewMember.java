public abstract class CrewMember {
    private String name;
    private CrewRank crewRank;

    public CrewMember(String name,CrewRank crewRank){
        this.name=name;
        this.crewRank=crewRank;
    }

    public String getName() {
        return name;
    }

    public String getCrewRankValue() {
        return this.crewRank.getRankName();
    }
}
