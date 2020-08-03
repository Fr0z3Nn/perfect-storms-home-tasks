package ru.svivanov.module01.TASK_08;

public class Task_04 {
    public static void main(String[] args) {
        //TODO Write a method that takes an integer parameter and displays numbers from 0 to the parameter. Use recursion. Call it in the main method.

        recursionPrint(5);

    }

    private static void recursionPrint(int num) {
        if (num < 0) {
            return;
        }
        System.out.println(num + " ");
        recursionPrint(num - 1);
    }

}
