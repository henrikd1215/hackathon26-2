import java.util.ArrayList;

public class Subject {
    ArrayList<SimilarAssignments> assignmentTypes;
    String name;

    public int id;
    public static int nextId;

    public Subject(String name) {
        this.name = name;

        id = nextId;
        nextId++;
    }
}
