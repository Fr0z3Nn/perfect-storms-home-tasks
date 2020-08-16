package ru.svivanov.module02.TASK_02;

import java.util.Objects;

public class Human {
    String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        for(char letter : name.toCharArray()){
            hash+=letter;
        }
        return hash;
    }
}
