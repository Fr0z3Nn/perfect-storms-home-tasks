package ru.svivanov.module01.TASK_09;

public class Task_01 {
    public static void main(String[] args) {
        //TODO How many objects will be in a String Pool?
        String st;
        st = "Java"; // in pool (1)
        String st2 = new String("Java"); // new object out of pool  (1)
        String st3 = st2.intern(); // in pool, but Java is already here (1)
        String st4 = "java"; // in pool (2)
        st = null; // st -> null, but Java in pool.(2)
        String st6 = new String("JAVA"); // new object out of pull (2)
        //ANSWER: 2
    }
}
