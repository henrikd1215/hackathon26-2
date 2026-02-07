package com.middleenddevelopers;
import java.util.ArrayList;

public class Subject {
    public ArrayList<SimilarAssignments> assignmentTypes = new ArrayList<>();
    public String name;

    public final int id;
    public static int nextId;

    public Subject() {
        id = nextId;
        nextId++;
    }

    public Subject(String name) {
        this.name = name;

        id = nextId;
        nextId++;
    }

    public SimilarAssignments getAssignmentType(int assignmentTypeIndex) {
        return assignmentTypes.get(assignmentTypeIndex);
    }

    public Assignment getAssignment(int assignmentTypeIndex, int assignmentIndex) {
        return assignmentTypes.get(assignmentTypeIndex).getAssignment(assignmentIndex);
    }

    public int size() {
        return assignmentTypes.size();
    }
}
