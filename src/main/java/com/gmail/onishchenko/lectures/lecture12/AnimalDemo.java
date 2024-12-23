package com.gmail.onishchenko.lectures.lecture12;

import javax.swing.*;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("dog", 1),
                new Cat("cat", 1),
        };
        print(animals);
        saySomething(animals);


        Cat cat = new Cat("pretty cat", 2, "black");
        cat.describe();

        Animal britishCat = new BritishCat();
        britishCat.describe();
        britishCat.say();
    }

    private  static void print(Animal[] animals) {
        System.out.println();
        for (Animal animal : animals) {
            animal.describe();
        }
    }

    private  static void saySomething(Animal[] animals) {
        System.out.println();
        System.out.println("SAYING...");
        for (Animal animal : animals) {
            animal.say();
        }
        System.out.println("============");
    }
}
