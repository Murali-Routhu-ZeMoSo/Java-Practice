package com.codewithmurali.assignment07.a;

public class Gerbil extends Rodent{
    public Gerbil(){
        System.out.println("this is a gerbil");
    }
    @Override
     void eats() {
        System.out.println("Gerbil eats meat only");
    }
}
