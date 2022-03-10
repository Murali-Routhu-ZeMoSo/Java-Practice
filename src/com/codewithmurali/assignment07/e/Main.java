package com.codewithmurali.assignment07.e;

public class Main {
    public static void main(String[] args) {
        OuterClass2 oc2 = new OuterClass2();
       OuterClass2.InnerClass2 innerClass2 = oc2.new InnerClass2("from main method");
    }


}
