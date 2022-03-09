package com.codewithmurali.assignment07.a;

public class Mouse extends Rodent{

    public Mouse(){
        System.out.println("This is mouse");
    }
    @Override
     void eats() {
        System.out.println("a mouse eats meat and vegetarian foods");
    }
}
