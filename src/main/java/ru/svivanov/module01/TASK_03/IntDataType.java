package ru.svivanov.module01.TASK_03;

import org.glowroot.instrumentation.api.Logger;

import java.lang.instrument.*;

public class IntDataType {


    //TODO Write a class that assigns the value 1200 to x, and then displays: in the first line: this value; in the
    // second line: the square of this value; in the third line: the cube of this value. The result should be with
    // a int data type.
    public static void main(String[] args) {
        int x = 1200;
        System.out.println((int)Math.pow(x,2));
        System.out.println((int)Math.pow(x,3));
    }
    // int data type stores the numbers of range -2147483648 to 2147483647, it takes 4 byte.
    public void difference(){
        Integer i = 20; //heap - 20 stack-i
        int j = 10; //stack - 10;
        System.out.println();
        //reference data type have methods and should be compared by equals not ==. Reference data type can be null.
        //TODO ADD AGENT
    }
}
