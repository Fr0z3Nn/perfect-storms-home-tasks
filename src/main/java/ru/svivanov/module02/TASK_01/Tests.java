package ru.svivanov.module02.TASK_01;

import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public void nameCheckPerson(){
    String expectedName = "John";
    String givenName = "John";
    Person person = new Person(givenName,20);
    String res = person.getName();
        Assert.assertEquals(res,expectedName);
    }

    @Test
    public void ageCheckPerson(){
        int expectedAge = 20;
        int givenAge = 20;
        Person person = new Person("John",givenAge);
        int res = person.getAge();
        Assert.assertEquals(res,expectedAge);
    }
}
