package ru.svivanov.module02.TASK_02;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Copper", 1, "DJ");
        Cat cat2 = new Cat("Silver", 2, "PRO-DJ");
        Cat cat3 = new Cat("Gold", 3, "NOOB-DJ");
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        Human human = new Human("Petro");
        System.out.println(human.hashCode());
        Dog dog1 = new Dog("Zhora");
        Dog dog2 = new Dog("Nick");
        Dog dog3 = new Dog("Zhora");
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.equals(dog3));
    }
}
