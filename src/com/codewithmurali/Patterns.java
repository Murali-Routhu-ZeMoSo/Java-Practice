package com.codewithmurali;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterns {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-z]*[a]?[a-z]*[b]*[c]");
        Matcher m = p.matcher("bsfsfsdfcsddsfdbfdsfdsfdsfsdc");
        boolean b = m.matches();
        System.out.println(b);
        System.out.println(p);
        System.out.println(m);
    }
}
