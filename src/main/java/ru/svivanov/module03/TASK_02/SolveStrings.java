package ru.svivanov.module03.TASK_02;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SolveStrings {
    private static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        IntStream.range(0, 5).forEach(n -> {
            list.add(scan.nextLine());
        });

        IntSummaryStatistics statistics = list.stream()
                .mapToInt(String::length)
                .summaryStatistics();

        list.stream()
                .filter(n -> (n.length() == statistics.getMin() || n.length() == statistics.getMax()))
                .findFirst()
                .ifPresent(System.out::println);

    }
}
