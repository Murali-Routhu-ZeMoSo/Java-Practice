package com.codewithmurali.assignment07.d;

public class CycleFactory {
    static Cycle getCycleOfType(String cycleType){
        if(cycleType.compareToIgnoreCase("unicycle")==0){
            return new Unicycle();
        }
        else if(cycleType.compareToIgnoreCase("bicycle")==0){
            return new Bicycle();
        }
        else if(cycleType.compareToIgnoreCase("tricycle")==0){
            return new Tricycle();
        }
        else{
            System.out.println("choose a correct type of cycle");
            return null;
        }
    }
}
