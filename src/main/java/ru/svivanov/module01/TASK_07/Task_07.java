package ru.svivanov.module01.TASK_07;

public class Task_07 {
    //TODO Country XYZ has a population of 10 million. The birth rate is 14 people per 1000 people, the death rate is 8 people.
    // Calculate what the population will be in 10 years, taking into account that the birth and death rates are constant.
    public static void main(String[] args) {
        //increase will be 14 - 8 = 6 people per 1000
        long population = 10_000_000L;
        for(int i = 0; i < 10; i++){
            population = (long)(population * 1.006);
            System.out.printf("%d год: популяция = %d\n",i+1,population);
        }
    }
}
