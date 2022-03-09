package com.codewithmurali.assignment07.a;

public class Hamster extends Rodent{
    public Hamster(){
        System.out.println("this is a hamster");
    }
    @Override
    void eats() {
        System.out.println("hamster eats only grass");
    }
}
