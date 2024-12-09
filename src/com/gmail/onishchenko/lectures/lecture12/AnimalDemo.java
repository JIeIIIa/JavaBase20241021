package com.gmail.onishchenko.lectures.lecture12;

import javax.swing.*;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] animals = {
                new Animal("dog", 1),
                new Animal("cat", 1),
        };
        print(animals);

        Cat cat = new Cat("pretty cat", 2, "black");
        cat.describe();

        BritishCat britishCat = new BritishCat();
        britishCat.describe();
        britishCat.say();
    }

    private  static void print(Animal[] animals) {
        System.out.println();
        for (Animal animal : animals) {
            animal.describe();
        }
    }
}
