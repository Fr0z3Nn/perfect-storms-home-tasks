package ru.svivanov.module01.TASK_09;

public class Task_03 {
    //TODO Enter 2 words consisting of an even number of letters.
    // Get a word consisting of the first half of the first word and the second half of the second word.
    public static void main(String[] args) {
        String s1 = "12345678";
        String s2 = "qwerty";
        String sum = s1.substring(0,s1.length()/2)+s2.substring(s2.length()/2);
        System.out.println(sum);
    }
}
