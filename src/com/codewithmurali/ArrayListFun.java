package com.codewithmurali;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;





public class ArrayListFun {
    Random r = new Random();

    public static  void num(String str){


        str="";
//        System.out.println(num);
        System.out.println(str);
        System.out.println("print number");
    }

    public static void main(String[] args) {

        int n=5;
//        ArrayListFun.num(n);
        String str="murali";
        ArrayListFun.num(str);
        System.out.println(str);
        System.out.println(n);
        Solution s = new Solution();
        s.printHello();
        List<String> names ;
        names = new ArrayList();
        String[] a = {"hello","hey"};
        names.add("murali");
        names.add("krishna");
        Stack<String> nameStack = new Stack<>();
        nameStack.addAll(names);
        nameStack.pop();
        nameStack.push("virat");
        for(String name : nameStack){
            System.out.println(name);
        }
        System.out.println(nameStack.get(1));
        for (String name : names){
            System.out.println(name);
        }
        System.out.println(nameStack);
        System.out.println(names);

    }
}
