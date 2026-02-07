public class Assignment {
    public boolean isCompleted;
    public Difficulty diff;
    public double time;
    public int questions;
    
    public int id;
    public static int nextId;

    public Assignment(boolean isCompleted, Difficulty diff, double time, int questions) {
        this.isCompleted = isCompleted;
        this.diff = diff;
        this.time = time;
        this.questions = questions;

        id = nextId;
        nextId++;
    }
}
