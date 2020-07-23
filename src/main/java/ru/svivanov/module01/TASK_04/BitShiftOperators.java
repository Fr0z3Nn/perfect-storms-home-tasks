package ru.svivanov.module01.TASK_04;

public class BitShiftOperators {
    public static void main(String[] args) {
        //TODO Create a variable a = 10
        // Using the bitwise left shift operator double the number (Spoiler alert: The result should be 20).
        // Display the result on the screen. Using the bitwise right shift operator divide the number by 4.
        // (Spoiler alert: the result should be 5) Now set the variable to a value (-5).
        // Use the unsigned bitwise shift a right operator by 1. Print the result.
        // Why did the number become large and positive? What is the difference between the operator (>>>) and (>>)?
        int a = 10;
        int b = a << 1;
        System.out.println(b);
        System.out.println(b>>2);
        a = -5;
        System.out.println(a>>>1);

    }
    /*
    >>> - unsigned shift
    a = 10
    01010 >> 1
    00101 its number: 5

    a = -5;
    difference between the operator (>>>) and (>>)
    11111111111111111111111111111011 >> 1 == 11111111111111111111111111111101  // -3
    11111111111111111111111111111011 >> 1 == 01111111111111111111111111111101  // 2147483645
    */
}
