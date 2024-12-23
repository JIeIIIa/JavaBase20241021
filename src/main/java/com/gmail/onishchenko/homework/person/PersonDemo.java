package com.gmail.onishchenko.homework.person;

public class PersonDemo {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("John", 30, "Інженер"),
                new Person("Mary", 25, "Вчитель"),
                new Person("Bob", 35, "Лікар") ,
                new Person("Alice", 28,  "Архітектор")
        };

        for (Person person : persons) {
            person.printInfo();
        }

        System.out.println("\n\n");
        persons[3].switchProfession("Дизайнер");
        for (Person person : persons) {
            person.printInfo();
        }
    }

//    private static void printInfo(Person person) {
//        System.out.printf("Ім'я: %s, Вік: %d, Професія: %s", person.name, person.age, person.profession);
//    }
}
