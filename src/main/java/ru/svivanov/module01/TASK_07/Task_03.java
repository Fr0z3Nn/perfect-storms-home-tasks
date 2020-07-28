package ru.svivanov.module01.TASK_07;

public class Task_03 {
    //TODO You are given an array with elements 10, 20, 15, 17, 24, 35.
    // Find the multiplication of the elements of this array. Write this to the variable "mul".
    public static void main(String[] args) {
        int[] arrayForMultiplication = {10, 20, 15, 17, 24, 35};
        long mul = 1;
        for(int num : arrayForMultiplication){
            mul *= num;
        }
        System.out.println(mul);
    }
}
