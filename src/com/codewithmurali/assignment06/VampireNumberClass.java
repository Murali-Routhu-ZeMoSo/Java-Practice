package com.codewithmurali.assignment06;

import java.util.ArrayList;

public class VampireNumberClass {
    static ArrayList<String> list=new ArrayList<>();
    static void permute(String str, int l) {
        if (l == str.length()-1) {
            list.add(str);
        }
        else {
            for (int i = l; i <= str.length()-1; i++) {

                str = swap(str, l, i);
                permute(str,l + 1);
                str = swap(str, l, i);
            }
        }
    }

    static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    public static void main(String[] args) {
        int n = 1200;
        int count = 0;
        while (count < 100) {
            String num = String.valueOf(n);
            if (num.length() % 2 != 0) {
                n++;
                continue;
            }
            permute(num, 0);
            for (String s : list) {
                String first = s.substring(0, num.length() / 2);
                String second = s.substring(num.length() / 2, num.length());
                boolean bothContainTrailingZero =
                        (first.charAt(first.length() - 1) == '0' && second.charAt(second.length() - 1) == '0');
                if(!bothContainTrailingZero) {
                    if (Integer.parseInt(first) * Integer.parseInt(second) == n) {
                        System.out.println(num);
                        count++;
                        break;
                    }
                }
            }
            n++;
            list.clear();
        }
    }
}
