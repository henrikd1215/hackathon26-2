package com.middleenddevelopers;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SubjectsHandler {
    @JsonProperty("subjects")
    static ArrayList<Subject> subjects = new ArrayList<>();

    public SubjectsHandler() {}

    public String[] getSubjectNames() {
        String[] names = new String[subjects.size()];
        for (int i = 0; i < subjects.size(); i++) {
            names[i] = subjects.get(i).name;
        }

        return names;
    }

    public String[] getAssignmentTypeNames(int subjectIndex) {
        String[] names = new String[subjects.get(subjectIndex).assignmentTypes.size()];
        for (int i = 0; i < subjects.get(subjectIndex).size(); i++) {
            names[i] = subjects.get(subjectIndex).getAssignmentType(i).name;
        }

        return names;
    }

    public String[] getAssignmentNames(int subjectIndex, int assignmentTypeIndex) {
        String[] names = new String[subjects.get(subjectIndex).assignmentTypes.get(assignmentTypeIndex).assignments.size()];
        for (int i = 0; i < subjects.get(subjectIndex).getAssignmentType(assignmentTypeIndex).assignments.size(); i++) {
            names[i] = subjects.get(subjectIndex).getAssignmentType(assignmentTypeIndex).assignments.get(i).name;
        }

        return names;
    }

    public void addAssignment(int subjectIndex, int assignmentTypeIndex, Assignment asgn) {
        subjects.get(subjectIndex).getAssignmentType(assignmentTypeIndex).assignments.add(asgn);
    }



    public void completeAssignment(int subjectIndex, int assignmentTypeIndex, int assignmentIndex) {
        subjects.get(subjectIndex).getAssignment(assignmentTypeIndex, assignmentIndex).isCompleted = true;
    }

    public void incompleteAssignment(int subjectIndex, int assignmentTypeIndex, int assignmentIndex) {
        subjects.get(subjectIndex).getAssignment(assignmentTypeIndex, assignmentIndex).isCompleted = false;
    }

    public double calculateAssignmentTime(int subjectIndex, int assignmentTypeIndex, Assignment asgn) {
        return TimeCalculator.calculateTime(asgn, subjects.get(subjectIndex).getAssignmentType(assignmentTypeIndex));
    }
    public double calculateAssignmentTime(int subjectIndex, int assignmentTypeIndex, int assignmentIndex) {
        return TimeCalculator.calculateTime(subjects.get(subjectIndex).getAssignment(assignmentTypeIndex, assignmentIndex), subjects.get(subjectIndex).getAssignmentType(assignmentTypeIndex));
    }
}
