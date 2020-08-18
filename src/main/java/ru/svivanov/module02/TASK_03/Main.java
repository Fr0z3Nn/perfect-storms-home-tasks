package ru.svivanov.module02.TASK_03;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Sam", 27);
        doctor.heal();
        doctor.think();
        doctor.workInfo();
        Builder builder = new Builder("John", 19);
        builder.drag();
        builder.builder();
        builder.workInfo();
        Programmer programmer = new Programmer("Tom", 31);
        programmer.programming();
        programmer.think();
        programmer.workInfo();
    }

}
