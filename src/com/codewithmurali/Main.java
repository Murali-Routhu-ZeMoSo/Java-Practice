package com.codewithmurali;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str2 = sc.next();
        String[] strings=str.split("-");
        System.out.println(strings[0]);
        System.out.println(str2);

    }
}
