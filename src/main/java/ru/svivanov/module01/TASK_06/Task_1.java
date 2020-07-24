package ru.svivanov.module01.TASK_06;

import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        //TODO Сreate an array and fill it with numbers from 1 to 10.
        int [] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }
}
