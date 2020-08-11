package ru.svivanov.module02.TASK_01;

import java.util.Date;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void meditation(){
        System.out.print("I think - it means I exist. " + "(" + this.name + ")" +" "+ new Date());
    }

    public void sortByName(Person[] personArr){
        for(int j = 0; j < personArr.length; j++){
            for(int i = 0; i < personArr.length-1; i++){
                if (personArr[i].getName().compareTo(personArr[i+1].getName()) > 0){
                    Person temp = personArr[i];
                    personArr[i] = personArr[i + 1];
                    personArr[i + 1] = temp;
                }
            }
        }
    };

    public void sortByAge(Person[] personArr){
        for(int j = 0; j < personArr.length; j++){
            for(int i = 0; i < personArr.length-1; i++){
                if (personArr[i].getAge() > personArr[i+1].getAge()){
                    Person temp = personArr[i];
                    personArr[i] = personArr[i + 1];
                    personArr[i + 1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
