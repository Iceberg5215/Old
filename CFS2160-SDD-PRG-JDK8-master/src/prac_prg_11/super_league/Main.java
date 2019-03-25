package prac_prg_11;

public class Main {

    public static void main (String[] args) {
        League lg = new League();

        Team hudds = new Team("Huddersfield Giants");
        Team hull = new Team("Hull FC");
        Team leeds = new Team("Leeds Rhinos");
        Team wigan = new Team("Wigan Warriors");

        hudds.playMatch(12,22);
        hull.playMatch(22,12);
        leeds.playMatch(30,10);
        wigan.playMatch(10,30);
        hudds.playMatch(20,12);
        hull.playMatch(12,12);
        leeds.playMatch(30,30);
        hudds.playMatch(12,22);
        leeds.playMatch(30,10);
        wigan.playMatch(10,30);
        leeds.playMatch(30,30);
        hudds.playMatch(22,22);
        leeds.playMatch(30,10);
        wigan.playMatch(10,30);

        lg.addTeam(hudds);
        lg.addTeam(hull);
        lg.addTeam(leeds);
        lg.addTeam(wigan);

        lg.sortTeams();
        lg.printTeam();

        System.out.println();
    }

}
