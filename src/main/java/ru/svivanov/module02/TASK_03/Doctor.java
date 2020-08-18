package ru.svivanov.module02.TASK_03;

public class Doctor extends AbstractClass{

    public Doctor(String name, int age) {
        super(name, age);
    }

    @Override
    public void workInfo() {
        System.out.println("Doctor");
    }

    public void heal(){
        System.out.println("Heals");
    }
}
