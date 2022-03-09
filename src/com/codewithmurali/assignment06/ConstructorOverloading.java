package com.codewithmurali.assignment06;

public class ConstructorOverloading {
    public static void main(String[] args) {
        A a = new A();
    }
}

class A {
    public  A(){
        this("Murali");
    }
    public A(String str){
        System.out.println(str);
    }
}
