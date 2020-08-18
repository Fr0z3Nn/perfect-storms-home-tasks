package ru.svivanov.module02.TASK_03;

public class Programmer extends AbstractClass implements Intellectual{

    public Programmer(String name, int age) {
        super(name, age);
    }

    @Override
    public void workInfo() {
        System.out.println("Programmer");
    }

    public void programming(){
        System.out.println("Programming");
    }

    @Override
    public void think() {
        System.out.println("Thinks");
    }
}
