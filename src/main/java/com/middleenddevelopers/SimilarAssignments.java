package com.middleenddevelopers;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SimilarAssignments {
    @JsonProperty("assignments")
    public ArrayList<Assignment> assignments = new ArrayList<>();
    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    @JsonProperty("name")
    public String name;
    public String getName() {
        return name;
    }

    /*@JsonProperty("id")
    public final int id;
    public int getId() {
        return id;
    }

    @JsonProperty("next_id")
    public static int nextId;
    public int getNextId() {
        return nextId;
    }*/

    public SimilarAssignments() {
        //id = nextId;
        //nextId++;
    }

    public SimilarAssignments(String name) {
        this.name = name;

        //id = nextId;
        //nextId++;
    }

    public Assignment getAssignment(int assignmentIndex) {
        return assignments.get(assignmentIndex);
    }
}
