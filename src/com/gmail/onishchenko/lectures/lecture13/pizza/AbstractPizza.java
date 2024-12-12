package com.gmail.onishchenko.lectures.lecture13.pizza;

public abstract class AbstractPizza extends Pizza {
    private String name;

    public AbstractPizza(String name) {
        this.name = name;
    }

    public abstract void make();
}
