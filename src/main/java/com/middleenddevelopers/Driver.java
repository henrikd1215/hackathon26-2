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


        subjectsHandler.subjects.add(new Subject("Test"));


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
