package ru.svivanov.module03.TASK_02;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SolveStrings {
    private static ArrayList<String> list = new ArrayList<>();
    private static int min;
    private static int max;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        IntStream.range(0, 5).forEach(n -> {
            String m = scan.nextLine();
            list.add(m);
        });

        list.stream().mapToInt(String::length).max().ifPresent(n -> min = n);
        list.stream().mapToInt(String::length).min().ifPresent(n -> max = n);

        list.stream().filter(n -> (n.length() == min || n.length() == max)).findFirst().ifPresent(System.out::println);
    }

}
