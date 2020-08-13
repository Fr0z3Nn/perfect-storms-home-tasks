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
        Person p1 = new Person("Form", 27);
        Person p2 = new Person("Brim", 17);
        Person p3 = new Person("Arin", 32);
        Person p4 = new Person("Tro", 9);
        Person p5 = new Person("Limo", 61);
        Person p6 = new Person("Miss", 36);
        Person[] personArray = new Person[6];
        personArray[0] = p1;
        personArray[1] = p2;
        personArray[2] = p3;
        personArray[3] = p4;
        personArray[4] = p5;
        personArray[5] = p6;
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(personArray));
        Person[] expectedSortByName = new Person[6];
        expectedSortByName[0] = p3;
        expectedSortByName[1] = p2;
        expectedSortByName[2] = p1;
        expectedSortByName[3] = p5;
        expectedSortByName[4] = p6;
        expectedSortByName[5] = p4;
        Main.sortByName(personArray);
        System.out.println("Sorting by name:");
        System.out.println(Arrays.toString(personArray));
        Assert.assertArrayEquals(personArray,expectedSortByName);
        Person[] expectedSortByAge = new Person[6];
        expectedSortByAge[0] = p4;
        expectedSortByAge[1] = p2;
        expectedSortByAge[2] = p1;
        expectedSortByAge[3] = p3;
        expectedSortByAge[4] = p6;
        expectedSortByAge[5] = p5;
        Main.sortByAge(personArray);
        System.out.println("Sorting by age:");
        System.out.println(Arrays.toString(personArray));
        Assert.assertArrayEquals(personArray,expectedSortByAge);

    }
}
