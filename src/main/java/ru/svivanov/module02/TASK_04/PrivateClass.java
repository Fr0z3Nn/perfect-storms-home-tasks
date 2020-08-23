package ru.svivanov.module02.TASK_04;

public class PrivateClass {
    private String name;
    private int age;
    private String address;

    public static int count;

    public PrivateClass() {
        count++;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}
