package com.codewithmurali.assignment06;

public class StringConstructor {
    public static void main(String[] args) {
        B b = new B("murali");
        B[] references =new B[2];
        references[0] = new B("krishna");
        references[1] = new B("Routhu");

    }
}
class  B{
    B(String name){
        System.out.println(name);
    }
}
