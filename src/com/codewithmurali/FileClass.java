package com.codewithmurali;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileClass {
    public static void main(String[] args) {
        Scanner sc ;
        File f;
        FileHandler fh;
        Logger logger = Logger.getLogger("test");
        try{

            f= new File("logs");
            f.mkdir();

            if(!f.exists()){
                f.createNewFile();
            }
            fh = new FileHandler(f.getName(),true);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
            logger.setLevel(Level.FINEST);
            logger.info("we have set a logger info");
            logger.finest("hello");
            throw new IOException();
//
        }catch (IOException ioException){
            logger.finest("here is the stack trace");
            logger.severe(ioException.getMessage());
        }

        try{
            PrintWriter pw = new PrintWriter("Output.txt");
            pw.println("This is murali");
            pw.println("this is krishna");
            pw.close();
        }catch (FileNotFoundException fe){
            System.out.println(fe);
        }
    }
}
