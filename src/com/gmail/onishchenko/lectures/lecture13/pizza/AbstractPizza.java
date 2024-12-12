package com.gmail.onishchenko.lectures.lecture13.pizza;

public abstract class AbstractPizza implements Pizza, Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public AbstractPizza(String name) {
        this.name = name;
    }
}
