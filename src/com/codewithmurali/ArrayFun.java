package com.codewithmurali;

import java.util.Scanner;

class Solution{
    public static void printHello(){
        System.out.println("print hello");
    }
    public void name(){
        System.out.println("name");
    }
}
public class ArrayFun {

    public static void main(String[] args) {
        int a[];
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        a= new int[n];
        a[0] = 5;
        a[1] = 32;
        a[2] = 54;
        a[3] = 77;
        a[4] = 54;

        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
        for(int num : a){
            System.out.println(num);
        }

    }
}
