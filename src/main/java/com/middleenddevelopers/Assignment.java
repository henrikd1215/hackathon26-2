package com.middleenddevelopers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Assignment {
    @JsonProperty("available_books")
    public boolean isCompleted;

    @JsonProperty("time")

    public double time;

    @JsonProperty("questions")
    public int questions;

    @JsonProperty("name")
    public String name;

    @JsonProperty("id")
    public final int id;

    @JsonProperty("next_id")
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
