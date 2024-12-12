package com.gmail.onishchenko.lectures.lecture13.pizza;

public class PizzaDemo {
    public static void main(String[] args) {
        Pizza[] pizzas = {
                new DiabloPizza(),
                new MargarittaPizza(),
                new DiabloPizza()/*,
                new AbstractPizza("unknown pizza")*/ //AbstractPizza is abstract; cannot be instantiated
        };
        for (Pizza pizza : pizzas) {
            System.out.println("Pizza name is: " + ((AbstractPizza) pizza).getName());
            pizza.make();
            // pizza.getName();
        }
    }
}
