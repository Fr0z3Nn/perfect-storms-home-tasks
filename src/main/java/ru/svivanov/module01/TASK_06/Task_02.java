package ru.svivanov.module01.TASK_06;

import java.util.Arrays;
import java.util.stream.IntStream;


public class Task_02 {
    //TODO Сreate an array and fill it with numbers from 1 to 10.
    // Create a new array and fill it with the values from the previous array in reverse order
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] result = IntStream.rangeClosed(1, array.length).map(i -> array[array.length-i]).toArray();
        System.out.println(Arrays.toString(result));

    }
}
