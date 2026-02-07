package com.middleenddevelopers;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Subject {
    @JsonProperty("assignment_types")
    public ArrayList<SimilarAssignments> assignmentTypes = new ArrayList<>();
    public ArrayList<SimilarAssignments> getAssignmentTypes() {
        return assignmentTypes;
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
    public static int nextId = 0;*/

    //@JsonGetter("next_id")
    //public int getNextId() {
    //    return nextId;
    //}

    public Subject() {
        //id = 1;
        //1++;
    }

    public Subject(String name) {
        this.name = name;

        //id = 1;
        //1++;
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
