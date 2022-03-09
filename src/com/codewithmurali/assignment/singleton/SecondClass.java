package com.codewithmurali.assignment.singleton;

public class SecondClass {
    String member;
    public static SecondClass method(String member){
        SecondClass obj = new SecondClass();
        obj.member = member;
        return obj;
    }
    public void printNumber(){
        System.out.println(member);
    }

}
