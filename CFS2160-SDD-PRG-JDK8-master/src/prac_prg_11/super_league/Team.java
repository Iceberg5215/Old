package prac_prg_11;

public class Team implements Comparable <Team>{
    private String team;
    private int played;
    private int won;
    private int drawn;
    private int lost;
    private int gFor;
    private int gAgainst;
    private int ptsDiff;
    private int pts;

    public Team (String team) {
        this.team = team;
        this.played = 0;
        this.won = 0;
        this.drawn = 0;
        this.lost = 0;
        this.gFor = 0;
        this.gAgainst = 0;
        this.ptsDiff = 0;
        this.pts = 0;
    }

    public void playMatch (int gFor, int gAgainst) {
        if (gFor > gAgainst) {
            this.won += 1;
        }
        else if (gAgainst > gFor) {
            this.lost += 1;
        }
        else {
            this.drawn += 1;
        }

        if (won > 0) {
            this.played += 1;
        }
        else if (lost > 0) {
            this.played += 1;
        }
        else if (drawn > 0) {
            this.played += 1;
        }

        this.gFor = gFor;
        this.gAgainst = gAgainst;
        this.ptsDiff = gFor - gAgainst;
        this.pts = ((won * 2) + drawn);
    }

    public void printFormat () {
        final String stringFormat = "%-30s %5s %5s %5s %5s %5s %5s %5s %5s";

        System.out.println(String.format(stringFormat, this.team, this.played, this.won, this.drawn, this.lost, this.gFor, this.gAgainst, this.ptsDiff, this.pts));
    }

    @Override
    public String toString() {
        return "Team{" +
                "team='" + team + '\'' +
                ", played=" + played +
                ", won=" + won +
                ", drawn=" + drawn +
                ", lost=" + lost +
                ", gFor=" + gFor +
                ", gAgainst=" + gAgainst +
                ", ptsDiff=" + ptsDiff +
                ", pts=" + pts +
                '}';
    }

    @Override
    public int compareTo(Team tms) {
        if (won > lost) {
            return -1;
        }
        else if (lost > won) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
