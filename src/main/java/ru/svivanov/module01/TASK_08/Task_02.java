package ru.svivanov.module01.TASK_08;

public class Task_02 {
    public static void main(String[] args) {

        //first method
        //TODO Write a method with one parameter that will return true if the number is greater than zero,
        // otherwise it will return false. In the main method, call it and display it. Experiment with different parameters.
        System.out.println(isGreaterThanZero1(5));
        //second method
        //TODO Write a method with one parameter that will call the method from the previous job and, if true,
        // return the string: "number is greater than zero", otherwise the string "number is zero or less".
        // In the main method, call it and display it. Experiment with different parameters.

        // isGreaterThanZero(5) == true
        System.out.println(isGreaterThanZero2(5));
        //third method
        //TODO Write a method with one parameter that will call the method from the previous job and additionally
        // return a number. Example (number is greater than zero and equal to 10) In the main method,
        // call it and display it. Experiment with different parameters.
        System.out.println(isGreaterThanZero(5));

    }

    private static int isGreaterThanZero(int number) {
        System.out.print(isGreaterThanZero2(number) + " and equals to ");
        return number;
    }

    private static boolean isGreaterThanZero1(int number) {
        return number > 0;
    }

    private static String isGreaterThanZero2(int number) {
        return isGreaterThanZero1(number) ? "number is greater than zero" : "number is zero or less";
    }
}
