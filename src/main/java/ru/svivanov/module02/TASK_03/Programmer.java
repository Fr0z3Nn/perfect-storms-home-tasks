package ru.svivanov.module02.TASK_03;

public class Programmer extends AbstractClass{

    public Programmer(String name, int age) {
        super(name, age);
    }

    @Override
    public void workInfo() {
        System.out.println("Programmer");
    }

    public void heal(){
        System.out.println("Programming");
    }
}
