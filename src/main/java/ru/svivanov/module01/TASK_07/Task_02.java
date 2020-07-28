package ru.svivanov.module01.TASK_07;

import java.util.Scanner;

public class Task_02 {
    //TODO For a given any N that is entered from the keyboard,
    // print out all squares of natural numbers not exceeding N in ascending order.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loopEnd = scanner.nextInt();
        for(int i=1; i <= Math.round(Math.sqrt(loopEnd));i++){
            System.out.printf("%d ",i*i);
        }
    }
}
