package com.codewithmurali.assignment07.c;

public class CombinedClass extends ConcreteClass implements InterfaceCombined{
    @Override
    public void method1() {
        System.out.println("Implemented m1 in Combined Class");

    }

    @Override
    public void method2() {
        System.out.println("Implemented m2 in Combined Class");
    }

    @Override
    public void method3() {
        System.out.println("Implemented m3 in Combined Class");
    }

    @Override
    public void method4() {
        System.out.println("Implemented m4 in Combined Class");
    }

    @Override
    public void method5() {
        System.out.println("Implemented m5 in Combined Class");
    }

    @Override
    public void method6() {
        System.out.println("Implemented m6 in Combined Class");
    }

    @Override
    public void method7() {
        System.out.println("Implemented m7 in Combined Class");
    }

    @Override
    public void method8() {
        System.out.println("In Combined concrete class");
    }
    public void method9(Interface1 I){
        I.method1();
        I.method2();
    }
    public void method10(Interface2 I){
        I.method3();
        I.method4();
    }

    public void method11(Interface3 I){
        I.method5();
        I.method6();
    }

    public void method12(InterfaceCombined I){
        I.method1();
        I.method2();
        I.method3();
        I.method4();
        I.method5();
        I.method6();
        I.method7();
    }

}
