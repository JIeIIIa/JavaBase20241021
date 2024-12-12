package com.gmail.onishchenko.lectures.lecture13.pizza;

public class PizzaDemo {
    public static void main(String[] args) {
        Pizza[] pizzas = {
                new DiabloPizza(),
                new MargarittaPizza(),
                new DiabloPizza()/*,
                new Pizza("unknown pizza")*/ //Pizza is abstract; cannot be instantiated
        };
        for (Pizza pizza : pizzas) {
            pizza.make();
        }
    }
}
