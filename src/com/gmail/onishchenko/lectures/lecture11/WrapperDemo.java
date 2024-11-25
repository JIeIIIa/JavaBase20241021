package com.gmail.onishchenko.lectures.lecture11;

import java.util.ArrayList;
import java.util.List;

public class WrapperDemo {
    public static void main(String[] args) {
        Character character = Character.valueOf('c');
        Integer i = Integer.valueOf(42);

        ArrayList list = new ArrayList();
        list.add(i);
        System.out.println("First object of list is " + list.get(0));

    }
}
