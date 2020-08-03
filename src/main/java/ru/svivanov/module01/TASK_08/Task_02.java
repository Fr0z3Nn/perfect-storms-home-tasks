package ru.svivanov.module01.TASK_08;

public class Task_02 {
    public static void main(String[] args) {

        //first method
        //TODO Write a method with one parameter that will return true if the number is greater than zero,
        // otherwise it will return false. In the main method, call it and display it. Experiment with different parameters.
        System.out.println(isGreaterThanZero(5));
        //second method
        //TODO Write a method with one parameter that will call the method from the previous job and, if true,
        // return the string: "number is greater than zero", otherwise the string "number is zero or less".
        // In the main method, call it and display it. Experiment with different parameters.

        // isGreaterThanZero(5) == true
        System.out.println(isGreaterThanZero(true));
        //third method
        //TODO Write a method with one parameter that will call the method from the previous job and additionally
        // return a number. Example (number is greater than zero and equal to 10) In the main method,
        // call it and display it. Experiment with different parameters.
        //???????????
    }
    private static int isGreaterThanZero(String result){
        return 5;
    }

    private static boolean isGreaterThanZero(int number){
        return number > 0;
    }

    private static String isGreaterThanZero(boolean isGreater){
        return isGreater ? "number is greater than zero" : "number is zero or less";
    }
}
