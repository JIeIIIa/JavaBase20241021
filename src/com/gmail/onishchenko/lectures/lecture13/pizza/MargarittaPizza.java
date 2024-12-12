package com.gmail.onishchenko.lectures.lecture13.pizza;

public class MargarittaPizza extends Pizza {
    public MargarittaPizza() {
        super("Margaritta");
    }

    @Override
    public void make() {
        System.out.println("Making Margaritta pizza");
    }
}
