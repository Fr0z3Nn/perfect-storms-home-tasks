package ru.svivanov.module03.TASK_03;

import java.util.stream.LongStream;

public class Armstrong {
    private static void getNumbers(long value) {
        LongStream.range(1, value).filter(n -> {
            String numString = String.valueOf(n);
            long sum = 0;
            for (char number : numString.toCharArray()) {
                sum += Math.pow(Integer.parseInt(String.valueOf(number)), numString.length());
            }
            return n == sum;
        }).forEach(System.out::println);
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        getNumbers(1000);
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1048576);
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        getNumbers(100_000_000L);
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1048576);
        System.out.println("time = " + (b - a) / 1000);
    }
}
