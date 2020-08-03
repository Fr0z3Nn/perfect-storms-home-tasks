package ru.svivanov.module01.TASK_08;

public class Task_01 {
    public static void main(String[] args) {
        //first method
        //TODO Write a method with no parameters that displays numbers from 1 to 20. Even on the right, odd on the left.
        // Call it in the main method.
        oddEvenPrint();
        //second method
        //TODO Write a method with one parameter that will output the sum of numbers from 1 to the given parameter.
        // Call it in the main method
        sumN(3);
        //third method
        //TODO Write a method with two parameters that will print all numbers from the first parameter
        // to the second parameter, which are divisible by 3. Call it in the main method.
        divisibleBy3(2, 21);
        //fourth method
        //TODO Write a method with three parameters that will deduce whether such a triangle is possible.
        // (Tip: For a triangle, the sum of any two sides must be greater than the third.) Call it in the main method.
        triangle(3,5,32);
    }

    private static void triangle(int a, int b, int c) {
        boolean isReal = false;
        if (a < b + c) {
            if (b < a + c) {
                if (c < a + b) {
                    isReal = true;
                }
            }
        }
        System.out.println(isReal ? "possible" : "impossible");
    }

    private static void divisibleBy3(int first, int second) {
        for (; first <= second; first++) {
            if (first % 3 == 0) {
                System.out.print(first + " ");
            }
        }
    }

    private static void oddEvenPrint() {
        for (int i = 1; i < 20; i += 2) {
            System.out.print(i + " ");
        }
        for (int i = 2; i < 20; i += 2) {
            System.out.print(i + " ");
        }
    }

    private static void sumN(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
