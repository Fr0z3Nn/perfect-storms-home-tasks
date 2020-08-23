package ru.svivanov.module02.TASK_04;

class B {
    static int j = 5;

    static void abc(int i) {
        System.out.println(i);
    }

    public static void main(String[] args){
        abc(j++);
        System.out.println(j);
    }
}