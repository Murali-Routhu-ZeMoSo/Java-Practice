package com.codewithmurali.assignment07.a;

public class Assignment07A {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse();
        rodents[0].eats();
        rodents[1] = new Gerbil();
        rodents[1].eats();
        rodents[2] = new Hamster();
        rodents[2].eats();
    }
}


