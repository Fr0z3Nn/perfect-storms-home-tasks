package ru.svivanov.module01.TASK_03;

public class ByteDataType {
    //TODO Write a fragment of the class (group of commands) that will assign the first value: ​​127, and the second: 255,
    // and then the third variable will receive a value equal to the substraction of the values ​​of the two variables.
    // The result should be with a byte data type.
    public static void main(String[] args) {
       byte x = 127;
       byte y = (byte)255; // -1
       System.out.println((byte)(x-y)); // 127-(-1)=128 to byte => -128
    }
    // byte data type stores the numbers of range -128 to 127, it takes 1 byte.
}
