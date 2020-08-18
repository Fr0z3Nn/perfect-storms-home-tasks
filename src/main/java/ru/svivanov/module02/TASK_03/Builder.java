package ru.svivanov.module02.TASK_03;

public class Builder extends AbstractClass implements Strongman{

    public Builder(String name, int age) {
        super(name, age);
    }

    @Override
    public void workInfo() {
        System.out.println("Builder");
    }

    public void builder(){
        System.out.println("Builds");
    }

    @Override
    public void drag() {
        System.out.println("Drags");
    }
}
