package prac_prg_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Diary {
    private ArrayList<Job> jobs;

    public Diary() {
        jobs = new ArrayList<>();
    }

    public void addJob(Job jbs) {
        jobs.add(jbs);
    }

    public void searchJob() {
        System.out.println("What is your Job? ");

        Scanner search = new Scanner(System.in);

        String result = search.nextLine();

        for (Job x : jobs) {
            if (x.getDescription() != null && x.getDescription().contains(result)) {
                System.out.println(x);
            }
        }
    }

    public void printDiary() {
        if (this.jobs.isEmpty()) {
            System.out.println("ArrayList 'jobs' isEmpty");
        }
        else {
            System.out.println();
        }
    }

    public void sortByPriority() {
        Collections.sort(this.jobs);
    }

    public boolean removeTrue() {
       return jobs.removeIf(job -> (job.isFinished()));
    }
}
