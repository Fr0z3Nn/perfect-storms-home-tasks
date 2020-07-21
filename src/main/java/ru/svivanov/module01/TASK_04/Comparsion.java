package ru.svivanov.module01.TASK_04;

public class Comparsion {
    public static void main(String[] args) {
        //TODO Create variables a and b. Set the variable a = 3, b = 5. Display the result of each comparison operator.
        //< >= <= == !=
        int a = 3, b = 5;
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);

        //TODO Set the value of the variable a = 5, display the results on the screen.
        // Write in the comments what has changed, why? What data type does the comparison operator return?
        // Write the result of the work
        //
        //a != b
        //into a variable and display it on the screen.
        a = 5;
        System.out.println(a != b);

        // 5 != 5 => false. boolean type (3 != 5 => true)
    }
}
