package ru.svivanov.module01.TASK_04;

public class AssignmentOperators {
    //TODO Create a variable a and assign it the value 10, then use the following operators
    // to change the value of the variable: "+=" "-=" "*=" "/=" "%="
    // Add 3
    // Subtract 7
    // Multiply by 4
    // Divide by 8
    // Get the remainder of division by 2.
    // After each operation, display the variable a on the screen.
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x += 3);
        System.out.println(x -= 7);
        System.out.println(x *= 4);
        System.out.println(x /= 8);
        System.out.println(x %= 2);
    }
}
