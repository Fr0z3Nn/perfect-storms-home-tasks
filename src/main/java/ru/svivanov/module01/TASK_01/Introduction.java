//TODO 1.Create a simple project in IntelliJ IDEA Community Edition.
package ru.svivanov.module01.TASK_01;


import java.util.stream.IntStream;

//TODO 2.Create a new class named "Introduction".
public class Introduction {
    //TODO 3.Create a main method.
    public static void main(String[] args) {
        //TODO 4.In the main method write code to display 5 times the phrase: "Hello! My name is ..." - on one line with a space.
        IntStream.range(0,5).mapToObj(i -> "Hello! My name is John ").forEach(System.out::print);
        //TODO In the main method write code to display 5 times the phrase: "I want to be a java developer!" - every phrase on a new line.
        System.out.println();
        IntStream.range(0,5).mapToObj(i -> "I want to be a java developer!").forEach(System.out::println);
    }
}






