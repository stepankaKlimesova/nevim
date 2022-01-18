package com.company;

public class Record {

    private String exercise;
    private Time time; //ráno, dopo, poo, odpo, večer
    private int calories;

    public Record(String exercise, Time time, int calories) {
        this.exercise = exercise;
        this.time = time;
        this.calories = calories;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Record{" +
                "exercise='" + exercise + '\'' +
                ", time=" + time +
                ", calories=" + calories +
                '}';
    }
}
