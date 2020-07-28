package ru.svivanov.module01.TASK_07;

import java.util.Scanner;

public class Task_05 {
    //TODO The user enters integers sequentially from the keyboard.
    // After the user has entered zero, it is necessary to display the sum of all entered numbers.
    private static int inputNum;
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            inputNum = scanner.nextInt();
            sum += inputNum;
        }while(inputNum != 0);
        System.out.println(sum);
    }
}
