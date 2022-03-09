package com.codewithmurali.assignment05.main;

import com.codewithmurali.assignment05.data.FirstClass;
import com.codewithmurali.assignment05.singleton.SecondClass;

public class Assignment05 {
    public static void main(String[] args) {
        FirstClass fc = new FirstClass();
        fc.printInstance();
        fc.printLocal();//Not Possible
        SecondClass sc = SecondClass.method("Murali");
        sc.printNumber();
    }
}
