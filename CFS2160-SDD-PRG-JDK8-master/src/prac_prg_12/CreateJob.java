package prac_prg_12;

public class CreateJob {
    public static void main(String[] args) {
        Diary jobs = new Diary();

        Job cleaner = new Job("Cleaner",0,false);
        Job doctor = new Job("Doctor",6,false);
        Job engineer = new Job("Engineer",2,false);
        Job electrician = new Job("Electrician",3,false);
        Job manager = new Job("Manager",4,false);

        jobs.addJob(cleaner);
        jobs.addJob(doctor);
        jobs.addJob(engineer);
        jobs.addJob(electrician);
        jobs.addJob(manager);

        cleaner.setFinished(true);
        jobs.removeTrue();
        jobs.sortByPriority();
        jobs.searchJob();
        jobs.printDiary();
    }
}
