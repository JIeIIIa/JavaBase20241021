package com.gmail.onishchenko.lectures.lecture13.pizza;

public abstract class Pizza {
    private String name;

    public Pizza(String name) {
        this.name = name;
    }

    public void make() {
        System.out.println("Unknown receipt. Can't make " + name + " pizza");
    }
}
