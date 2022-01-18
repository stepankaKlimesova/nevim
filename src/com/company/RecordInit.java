package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RecordInit {

    static ArrayList<Time> time = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Record> records = new ArrayList<>();
    static HashMap<Time, Integer> hashRecords = new HashMap<>();
    static int calories = 0;

    public static void timeChooser() {
        time.add(Time.RANO);
        time.add(Time.DOPOLEDNE);
        time.add(Time.POLEDNE);
        time.add(Time.ODPOLEDNE);
        time.add(Time.VECER);
    }

    public static void recordInit() {
        Record record = new Record("", Time.DOPOLEDNE, 0);

        System.out.println("set exercise");
        record.setExercise(sc.next());
        System.out.println("Choose time");
        Print.printTime();
        record.setTime(time.get(sc.nextInt()));
        System.out.println("set calories");
        record.setCalories(sc.nextInt());

        records.add(record);
        hashRecords.merge(record.getTime(), record.getCalories(), Integer::sum);
        calories += record.getCalories();
        //System.out.println(record);
    }

}
