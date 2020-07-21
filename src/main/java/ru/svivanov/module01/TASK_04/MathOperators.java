package ru.svivanov.module01.TASK_04;

public class MathOperators {
    //TODO Create variables and assign values ​​where:
    // a is the sum of 10 and 2
    // b is the sum of a and 5
    // c - subtract a from b, add 1 to the result
    // d - multiply a, b and c
    // e - divide d by 8
    // f - get the remainder from dividing e by 30
    // i - change the sign of the variable f
    // Display all variables.
    public static void main(String[] args) {
        int a = 10 + 2;
        int b = a + 5;
        int c = a - b + 1;
        int d = a * b * c;
        int e = d / 8;
        int f = e % 30;
        int i = -f;
        System.out.printf("a = %d\n" +
                "b = %d\n" +
                "c = %d\n" +
                "d = %d\n" +
                "e = %d\n" +
                "f = %d\n" +
                "i = %d\n",a,b,c,d,e,f,i);
    }
}
