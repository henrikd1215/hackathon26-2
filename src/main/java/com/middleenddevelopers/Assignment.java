package com.middleenddevelopers;
public class Assignment {
    public boolean isCompleted;
    public double time;
    public int questions;
    public String name;

    public final int id;
    public static int nextId;

    public Assignment() {
        isCompleted = false;
        time = 0;
        questions = 0;
        name = "Unnamed";
        
        id = nextId;
        nextId++;
    }

    public Assignment(boolean isCompleted, double time, int questions, String name) {
        this.isCompleted = isCompleted;
        this.time = time;
        this.questions = questions;
        this.name = name;

        id = nextId;
        nextId++;
    }
}
