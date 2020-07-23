package ru.svivanov.module01.TASK_04;

public class BitwiseOperators {
    //TODO Create two variables as in the example. int a = 4; int b = 3;
    //&   |   ~   ^
    //Apply and display the output of the bitwise operators using the variables a and b.
    // What are bitwise operators like? How the number will change after applying the NOT operator (~).
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        System.out.println(a&b); // 0
        System.out.println(a|b); // 7
        System.out.println(~a); // -7
        System.out.println(~b); // -4
        System.out.println(a^b); // 7
    }
    //bit operators are needed for bitwise comparison of numbers
}
