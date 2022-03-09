package com.codewithmurali.assignment07.b;

public class Assignment07B {
    public static void main(String[] args) {

        Cycle[] cycles = new Cycle[3];
        cycles[0] = new Unicycle();//upcasting unicycle
        cycles[0].balance();

        cycles[1] = new Bicycle(); //upcasting bicycle
        cycles[1].balance();

        cycles[2] = new Tricycle(); //upcasting tricycle
        cycles[2].balance();

        Unicycle unicycle = (Unicycle) cycles[0];
        unicycle.balance();

        Bicycle bicycle = (Bicycle) cycles[1];
        bicycle.balance();

        Tricycle tricycle = (Tricycle) cycles[2];
        tricycle.balance();
    }
}
