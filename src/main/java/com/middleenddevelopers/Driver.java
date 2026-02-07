package com.middleenddevelopers;

import java.io.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.core.*;

public class Driver {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        File f = new File("Assignments.json");

        //SubjectsHandler subjectsHandler = new SubjectsHandler();
        SubjectsHandler subjectsHandler;
        try {
            subjectsHandler = mapper.readValue(f, SubjectsHandler.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            subjectsHandler = new SubjectsHandler();
        }

        System.out.print(subjectsHandler.subjects.size());
        //System.out.print(subjectsHandler.subjects.get(0).name);


        subjectsHandler.subjects.add(new Subject("Test 2"));


        AddAssignmentWindow primaryWindow = new AddAssignmentWindow("Homework Time Calculator");

        primaryWindow.setSize(800, 500);
        primaryWindow.setLocation(500,200);
        primaryWindow.setVisible(true);



        try {
            mapper.writeValue(f, subjectsHandler);
        } catch (Exception e) {
        }
    }
}
