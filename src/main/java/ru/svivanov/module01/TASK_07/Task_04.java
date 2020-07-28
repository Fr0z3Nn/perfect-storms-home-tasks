package ru.svivanov.module01.TASK_07;

import java.util.*;

public class Task_04 {
    //TODO Display a picture in the console, using loop:
    //
    //          *
    //         ***
    //        *****
    //       *******
    //      *********
    //     ***********
    //    *************

    private static int lengthOfPyramid;

    public static void main(String[] args) {
        System.out.println("Введите длину основания пирамиды:");
        Scanner scanner = new Scanner(System.in);
        lengthOfPyramid = scanner.nextInt();
        StringBuilder base = createBaseOfPyramid();
        ArrayList<String> reversedPyramid = createReversedPyramid(base);
        reverseAndPrintPyramid(reversedPyramid);
    }
    private static void reverseAndPrintPyramid(ArrayList<String> reversedPyramid){
        Collections.reverse(reversedPyramid);
        for(String floor : reversedPyramid){
            System.out.println(floor);
        }
    }

    private static ArrayList<String> createReversedPyramid(StringBuilder base){
        ArrayList<String> reversedPyramid = new ArrayList<>();
        for (int i = lengthOfPyramid, k = 0; i >= 1; i-=2, k++){
            reversedPyramid.add(base.toString());
            base.replace(k,k+1," ");
            base.reverse();
            base.replace(k,k+1," ");
        }
        return reversedPyramid;
    }
    private static StringBuilder createBaseOfPyramid(){
        StringBuilder base = new StringBuilder();
        for (int i = 0; i < lengthOfPyramid; i++){
            base.append("*");
        }
        return base;
    }
}
