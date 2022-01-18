package com.company;

public class Print {

    public static void printTime() {
        for (int i = 0; i < RecordInit.time.size(); i++) {
            System.out.println(RecordInit.time.get(i) + " - " + i);
        }
    }

    public static void printCalories() {
        System.out.println(RecordInit.hashRecords.get(Time.DOPOLEDNE));
        System.out.println(RecordInit.calories);
    }

}
