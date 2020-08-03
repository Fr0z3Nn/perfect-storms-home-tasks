package ru.svivanov.module01.TASK_08;

public class Task_03 {
    public static void main(String[] args) {
        //TODO Write multiplication methods using overloading:

        //With one integer parameter.
        //With two integer parameters.
        //With one double parameter and one integer parameter.
        //With two double parameters.
        //With an integer array. Call all of these methods in the main method.
        multiplication(2);
        multiplication(2, 3);
        multiplication(3.2, 2);
        multiplication(3.4, 1.5);
        multiplication(new int[]{1, 2, 3, 4, 5});
    }

    private static void multiplication(int num) {
        System.out.println(num * num);
    }

    private static void multiplication(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    private static void multiplication(double num1, int num2) {
        System.out.println(num1 * num2);
    }

    private static void multiplication(double num1, double num2) {
        System.out.println(num1 * num2);
    }

    private static void multiplication(int[] numbers) {
        int multi = 1;
        for (int number : numbers) {
            multi *= number;
        }
        System.out.println(multi);
    }
}
