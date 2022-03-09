package com.codewithmurali;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Assignment01 {
    private static List<String> fileList;
    private static  File file;
    private static  final String anyChar = "[^\\s]*";

    public static void matchedFileNames(String pattern){
        Pattern p = Pattern.compile(anyChar +pattern+ anyChar, Pattern.CASE_INSENSITIVE);
        for(String name:fileList){
            if(p.matcher(name).matches()){//name.toLowerCase().contains(pattern)
                System.out.println(name);
                System.out.println("Path: "+ file.getAbsolutePath()+ "/"+name);
            }
        }

    }

    public static boolean hasMatchingFiles(String pattern){
        Pattern p = Pattern.compile(anyChar +pattern+ anyChar,Pattern.CASE_INSENSITIVE);
        for(String name:fileList){
            if(p.matcher(name).matches()){//name.toLowerCase().contains(pattern)
               return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String pattern;
        file = new File("/home/murakr");
        fileList = List.of(file.list());
        do{
            System.out.println("enter the pattern you want to search");
            pattern = sc.nextLine().toLowerCase().trim();
            if(hasMatchingFiles(pattern)){
                System.out.println("Files with the pattern \""+ pattern+ "\"");
                System.out.println("**************************************");
                matchedFileNames(pattern);
            }
            else{
                System.out.println("No files found with the pattern \""+ pattern+ "\"");
                System.out.println("**************************************");
            }

            System.out.println("do u want to continue");

        }while(sc.nextLine().charAt(0)=='y');
    }
}
