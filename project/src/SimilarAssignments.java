import java.util.ArrayList;

public class SimilarAssignments {
    ArrayList<Assignment> assignments = new ArrayList<>();
    String name;

    public final int id;
    public static int nextId;

    public SimilarAssignments(String name) {
        this.name = name;

        id = nextId;
        nextId++;
    }
}
