package com.gmail.onishchenko.lectures.lecture13.pizza;

public class DiabloPizza extends Pizza {
    public DiabloPizza() {
        super("Diablo");
    }

    @Override
    public void make() {
        System.out.println("Make Diablo pizza: add chilly");
    }
}
