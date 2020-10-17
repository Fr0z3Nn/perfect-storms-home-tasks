package ru.svivanov.module03.TASK_02;

import java.util.ArrayList;
import java.util.LinkedList;

public class CompareCollections {
    public static void main(String[] args) {
        addToBegin();
        removeFromCenter();
        getIElement();
    }

    private static void getIElement() {
        System.out.println("GET I ELEMENT");
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list1.add(0, i);
        }
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list1.get((int) (Math.random() * 10000));
        }
        long end1 = System.currentTimeMillis();
        System.out.printf("ARRAYLIST: %d ms\n", end1 - start1);


        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            list2.add(0, i);
        }
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list1.get((int) (Math.random() * 10000));
        }
        long end2 = System.currentTimeMillis();
        System.out.printf("LINKEDLIST: %d ms\n", end2 - start2);
    }

    private static void removeFromCenter() {
        System.out.println("REMOVE FROM CENTER");
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list1.add(0, i);
        }
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            list1.remove(list1.size() / 2);
        }
        long end1 = System.currentTimeMillis();
        System.out.printf("ARRAYLIST: %d ms\n", end1 - start1);


        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            list2.add(0, i);
        }
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            list1.remove(list1.size() / 2);
        }
        long end2 = System.currentTimeMillis();
        System.out.printf("LINKEDLIST: %d ms\n", end2 - start2);
    }

    private static void addToBegin() {
        System.out.println("ADD TO BEGIN");
        ArrayList<Integer> list1 = new ArrayList<>();
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list1.add(0, 5);
        }
        long end1 = System.currentTimeMillis();
        System.out.printf("ARRAYLIST: %d ms\n", end1 - start1);
        LinkedList<Integer> list2 = new LinkedList<>();
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list2.add(0, 5);
        }
        long end2 = System.currentTimeMillis();
        System.out.printf("LINKEDLIST: %d ms\n", end2 - start2);
    }
}
