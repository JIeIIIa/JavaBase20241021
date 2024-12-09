package com.gmail.onishchenko.lectures.lecture12;

public class Cat extends Animal {
    String color;

    public Cat() {
       super("default cat", -1);
    }

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void describe() {
        System.out.println(" -= CAT =-");
        super.describe();
        System.out.println("I'm a " + color + " cat. My name is " + name + ". My age is " + age);
    }

}
