package ru.svivanov.module02.TASK_01;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Sam", 33);
    }
    public static void sortByName(Person[] personArr){
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

    public static void sortByAge(Person[] personArr){
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
}
