package com.gmail.onishchenko.lectures.lecture11;

import java.util.ArrayList;
import java.util.List;

public class WrapperDemo {
    public static void main(String[] args) {
//        Character character = Character.valueOf('c');
        oldStyle();
        autoBoxingUnboxing();
    }

    private static void oldStyle() {
        Integer i = new Integer(42);

        Integer result = new Integer(i.intValue() + 10);
        System.out.println("result == " + result);
        ArrayList list = new ArrayList();
        list.add(i);
        System.out.println("First object of list is " + list.get(0));
    }

    private static void autoBoxingUnboxing() {
        Integer i = null;

        Integer result = i + 10;
        System.out.println("result == " + result);
        ArrayList list = new ArrayList();
        list.add(i);
        System.out.println("First object of list is " + list.get(0));
    }
}
