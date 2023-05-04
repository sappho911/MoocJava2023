
public class Game {

    private String hometeam;
    private String guestteam;
    private int homepoints;
    private int guestpoints;

    public Game(String hometeam, String guestteam, int homepoints, int guestpoints) {
        this.hometeam = hometeam;
        this.guestteam = guestteam;
        this.homepoints = homepoints;
        this.guestpoints = guestpoints;
    }

    public String getHomeTeam() {
        return hometeam;
    }

    public String getGuestTeam() {
        return guestteam;
    }

    public boolean winnerIs(String team) {
        if (team.equals(hometeam) && homepoints > guestpoints) {
            return true;
        }

        if (team.equals(guestteam) && guestpoints > homepoints) {
            return true;
        }

        return false;
    }
}
