package ru.svivanov.module02.TASK_01;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


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

    @Test
    public void catPerson() {
        String cat = new Cat("Murzik", 5, Breed.NEBELUNG, new Person("Stepan", 30)).toString();
        String except = "Cat{name='Murzik', age=5, breed=NEBELUNG, owner=Person{name='Stepan', age=30}}";
        Assert.assertEquals(cat,except);
    }

    @Test
    public void personSort(){
        Person[] personArray = new Person[6];
        Person person = new Person("Form", 27);
        personArray[0] = person;
        personArray[1] = new Person("Brim", 17);
        personArray[2] = new Person("Arin", 32);
        personArray[3] = new Person("Tro", 9);
        personArray[4] = new Person("Limo", 61);
        personArray[5] = new Person("Miss", 36);
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(personArray));
        person.sortByName(personArray);
        System.out.println("Sorting by name:");
        System.out.println(Arrays.toString(personArray));
        person.sortByAge(personArray);
        System.out.println("Sorting by age:");
        System.out.println(Arrays.toString(personArray));

    }
}
