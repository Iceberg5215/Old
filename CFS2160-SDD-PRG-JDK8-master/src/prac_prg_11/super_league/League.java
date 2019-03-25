package prac_prg_11;

import java.util.ArrayList;
import java.util.Collections;

public class League {
    private ArrayList <Team> teams;

    public League () {
        teams = new ArrayList <> ();
    }

    public void addTeam (Team tms) {
        teams.add (tms);
    }

    public void sortTeams () { Collections.sort(this.teams); }

    public void printTeam () {
        if (this.teams.isEmpty ()) {
            System.out.println ("teams is empty");
        }
        else {
            System.out.println ();

            for (Team tms : teams) {
                tms.printFormat ();
            }
        }
    }
}
