package com.middleenddevelopers;

public class Driver {
    public static void main(String[] args) {
        AddAssignmentWindow primaryWindow = new AddAssignmentWindow("Homework Time Calculator");

        primaryWindow.setSize(800, 500);
        primaryWindow.setLocation(500,200);
        primaryWindow.setVisible(true);
    }
}
