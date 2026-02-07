package com.middleenddevelopers;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Subject {
    @JsonProperty("assignment_types")
    public ArrayList<SimilarAssignments> assignmentTypes = new ArrayList<>();

    @JsonProperty("name")
    public String name;

    @JsonProperty("id")
    public final int id;

    @JsonProperty("next_id")
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
