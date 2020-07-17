package ru.svivanov.module01.TASK_03;

public class ByteDataType {
    //TODO Write a fragment of the class (group of commands) that will assign the first value: ​​127, and the second: 255,
    // and then the third variable will receive a value equal to the substraction of the values ​​of the two variables.
    // The result should be with a byte data type.
    public static void main(String[] args) {
       int x = 255;
       int y = 127;
       byte z = (byte) (x - y);
    }
    // byte data type stores the numbers of range -128 to 127, it takes 1 byte.
}
