package com.gmail.onishchenko.lectures.lecture13.pizza;

public class PizzaDemo {
    public static void main(String[] args) {
        AbstractPizza[] pizzas = {
                new DiabloPizza(),
                new MargarittaPizza(),
                new DiabloPizza()/*,
                new AbstractPizza("unknown pizza")*/ //AbstractPizza is abstract; cannot be instantiated
        };
        for (AbstractPizza pizza : pizzas) {
            pizza.make();
        }
    }
}
