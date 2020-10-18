package ru.svivanov.module03.TASK_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IteratorTask {
    public static void main(String[] args) {
        ArrayList<Integer> list = IntStream.range(0,100)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
         list.iterator().forEachRemaining(n -> {
             if (n % 2 == 0) {
                 System.out.println(n);
             }
         });
    }
}
