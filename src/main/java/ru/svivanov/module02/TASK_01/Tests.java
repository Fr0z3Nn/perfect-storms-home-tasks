package ru.svivanov.module02.TASK_01;

import org.junit.Assert;
import org.junit.Test;


public class Tests {
    @Test
    public void nameCheckPerson(){
        Person person = new Person("John",20);
        String res = person.getName();
        Assert.assertEquals(res,"John");
    }

    @Test
    public void ageCheckPerson(){
        Person person = new Person("John",20);
        int res = person.getAge();
        Assert.assertEquals(res,20);
    }

    @Test
    public void PersonToString(){
        Person deckardCain = new Person("Deckard Cain", 68);
        deckardCain.meditation();
    }
}
