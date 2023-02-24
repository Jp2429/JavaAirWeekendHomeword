public enum CrewRank {
    CAPTAIN("captain"),
    FIRSTOFFICER("first officer"),
    FLIGHTATTENDANT("flight attendant");

    private final String rankName;

    CrewRank(String rankName) {
        this.rankName = rankName;
    }

    public String getRankName() {
        return rankName;
    }
}
