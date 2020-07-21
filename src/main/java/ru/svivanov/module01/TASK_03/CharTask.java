package ru.svivanov.module01.TASK_03;

import java.util.stream.IntStream;


public class CharTask {
    //TODO Write a class which displays the character in the first line “+”,
    // In the second - the sign “!”, In the third - the sign “?”.
    public static void main(String[] args) {
        char[] list = {'+','!','?'};
        IntStream.range(0,list.length).mapToObj(i -> list[i]).forEach(System.out::println);
    }
    // char data type stores 65535 values, it takes 2 byte(32bit).
}
