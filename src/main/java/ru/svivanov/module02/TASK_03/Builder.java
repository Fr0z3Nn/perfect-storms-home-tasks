package ru.svivanov.module02.TASK_03;

public class Builder extends AbstractClass {

    public Builder(String name, int age) {
        super(name, age);
    }

    @Override
    public void workInfo() {
        System.out.println("Builder");
    }

    public void heal(){
        System.out.println("Builds");
    }
}
