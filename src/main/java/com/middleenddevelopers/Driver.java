package com.middleenddevelopers;

import java.io.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.core.*;

public class Driver {
    public static void main(String[] args) {
        MainWindow primaryWindow = new MainWindow("Homework Time Calculator");

        primaryWindow.setSize(800, 500);
        primaryWindow.setLocation(500,200);
        primaryWindow.setVisible(true);

        SubjectsHandler subjectsHandler = new SubjectsHandler();
        ObjectMapper mapper = new ObjectMapper();
        File f = new File("Assignments.json");

        subjectsHandler.subjects.add(new Subject("Test"));

        try {
            mapper.writeValue(f, subjectsHandler);
        } catch (Exception e) {
        }
    }
}
