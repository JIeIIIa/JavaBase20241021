package com.gmail.onishchenko.lectures.lecture12;

import javax.swing.*;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] animals = {
                new Animal("dog", 1),
                new Animal("cat", 1),
        };
        print(animals);
    }

    private  static void print(Animal[] animals) {
        System.out.println();
        for (Animal animal : animals) {
            animal.describe();
        }
    }
}
