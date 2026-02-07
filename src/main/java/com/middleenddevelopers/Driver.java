package com.middleenddevelopers;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {
    public static void main(String[] args) {
//region Read from JSON
        ObjectMapper mapper = new ObjectMapper();
        File f = new File("Assignments.json");

        SubjectsHandler subjectsHandler;
        try {
            subjectsHandler = mapper.readValue(f, SubjectsHandler.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            subjectsHandler = new SubjectsHandler();
        }

        // This was used to test saving over multiple runs
        //System.out.print(subjectsHandler.subjects.size());
        //System.out.print(subjectsHandler.subjects.get(0).name);        
        //subjectsHandler.subjects.add(new Subject("Test 2"));
        //System.out.print(subjectsHandler.subjects.size());
//endregion


        Subject mathSubject = new Subject("Math");
        SimilarAssignments asgnType = new SimilarAssignments("Problem by problem");
        Assignment mathAsgn = new Assignment(false, 0, 18, "Homework 3");

        asgnType.assignments.add(mathAsgn);
        mathSubject.assignmentTypes.add(asgnType);
        subjectsHandler.subjects.add(mathSubject);


        AddAssignmentWindow primaryWindow = new AddAssignmentWindow("Homework Time Calculator");

        primaryWindow.setSize(800, 500);
        primaryWindow.setLocation(500,200);
        primaryWindow.setVisible(true);



//region Save to JSON
        try {
            mapper.writeValue(f, subjectsHandler);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
//endregion
}
