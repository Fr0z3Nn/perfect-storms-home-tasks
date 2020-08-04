package ru.svivanov.module01.TASK_09;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        //TODO Create a method which can reverse any string and demonstrate it in the main method using Scanner.
        Scanner scanner = new Scanner(System.in);
        System.out.println(stringReverse(scanner.nextLine()));
    }
    private static String stringReverse(String word){
        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
