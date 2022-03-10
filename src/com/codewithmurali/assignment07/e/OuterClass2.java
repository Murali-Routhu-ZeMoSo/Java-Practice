package com.codewithmurali.assignment07.e;


public class OuterClass2 {
      class InnerClass2 extends OuterClass1.InnerClass1 {


          InnerClass2(String name) {
              new OuterClass1().super(name);
          }
      }
}
