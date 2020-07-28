package ru.svivanov.module01.TASK_07;

public class Task_01 {
//TODO Write a program that prints the squares of the numbers 10 to 20, using a "for" loop.
    public static void main(String[] args) {
        for(int i = 10; i <= 20; i++){
            System.out.println(Math.round(Math.pow(i,2))); // i*i
        }
    }
}
