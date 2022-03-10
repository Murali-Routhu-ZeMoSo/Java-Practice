package com.codewithmurali.assignment07.d;

public class Main {

    public static void main(String[] args) {
        Cycle unicycle =CycleFactory.getCycleOfType("Unicycle");
        unicycle.noOfTyres();
        Cycle bicycle = CycleFactory.getCycleOfType("bicycle");
        bicycle.noOfTyres();
        Cycle tricycle = CycleFactory.getCycleOfType("tricycle");
        tricycle.noOfTyres();
    }
}
