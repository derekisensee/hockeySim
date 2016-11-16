package hockey;

/**
 * Created by derek_000 on 11/15/2016.
 */
public class Player {
    String name;
    String team;

    public Player(String n, String t) {
        name = n;
        team = t;
    }
    public String getName() {
        return name;
    }
    public String getTeam() {
        return team;
    }
}
