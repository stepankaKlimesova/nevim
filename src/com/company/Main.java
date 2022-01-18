package com.company;

public class Main {

    public static void main(String[] args) {

        RecordInit.timeChooser();
        RecordInit.recordInit();
        RecordInit.recordInit();
        RecordInit.recordInit();

        System.out.println(RecordInit.records);
        Print.printCalories();
    }
}
