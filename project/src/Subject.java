import java.util.ArrayList;

public class Subject {
    ArrayList<SimilarAssignments> assignmentTypes;
    String name;

    public final int id;
    public static int nextId;

    public Subject(String name) {
        this.name = name;

        id = nextId;
        nextId++;
    }
}
