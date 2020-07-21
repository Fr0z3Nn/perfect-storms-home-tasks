package ru.svivanov.module01.TASK_03;

public class ShortDataType {
    //TODO Write a fragment of the class (group of commands) that will assign the values ​​-32768 and 32768 to two
    // variables, and then the third variable will receive a value equal to the sum of the values ​​of the two variables.
    // The result should be with a short data type.
    public static void main(String[] args) {
        short x = -32768;
        short y = (short)32768;//-32768
        System.out.println((byte)(x-y)); //-32768-(-32768)==0
    }
    // short data type stores the numbers of range -32768 to 32767, it takes 2 byte.
}
