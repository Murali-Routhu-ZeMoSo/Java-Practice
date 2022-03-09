/* Instance and class variables are initialized with default values by the compiler
if we do not initialize then
But local variables don't have a default value like class/instance variables so using without
initializing causes errors
*/


package com.codewithmurali.assignment.data;

public class FirstClass{
    int id;
    char status;
    public void printInstance(){
        System.out.println(id);
        System.out.println(status);
    }
    public void printLocal(){
        int id1;
        char status1;
//        System.out.println(id1);
//        System.out.println(status1);
    }
}

