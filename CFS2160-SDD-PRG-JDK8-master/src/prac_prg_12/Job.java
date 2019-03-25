package prac_prg_12;

public class Job implements Comparable <Job> {
    private String description;
    private int priority;
    private boolean finished;

    public Job(String description, int priority, boolean finished) {
        this.description = description;
        this.priority = priority;
        this.finished = finished;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "Job{" +
                "description='" + description + '\'' +
                ", priority=" + priority + '\'' +
                ", finished=" + finished +
                '}';
    }

    @Override
    public int compareTo(Job jbs) {
        return (this.getPriority() < ((Job) jbs).getPriority() ? -1 : (this.getPriority() == ((Job) jbs).getPriority() ? 0 : 1));
    }
}
