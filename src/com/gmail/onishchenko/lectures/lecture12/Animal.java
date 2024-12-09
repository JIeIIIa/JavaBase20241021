package com.gmail.onishchenko.lectures.lecture12;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void describe() {
        System.out.println("I'm " + name + ". My age is " + age);
    }

    public void say() {

    }
}
