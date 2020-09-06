package ru.svivanov.module02.TASK_08.support;

public class Pupil extends People {
    int classNumber;

    public Pupil(String name, int age, String hairColor, int classNumber) {
        super(name, age, hairColor);
        this.classNumber = classNumber;
    }
}
