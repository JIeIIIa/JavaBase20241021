package com.gmail.onishchenko.lectures.lecture14;

public class Printer {
    public static void main(String[] args) {
        ConsolePrinter consolePrinter = new ConsolePrinter();
        print(consolePrinter);

        Printable formattedPrinter = new Printable() {
            private int field = 10;

            @Override
            public void print() {
                System.out.print("Formatted: ");
                someMethod();
            }

            private void someMethod() {
                System.out.println(this);
            }
        };

        print(formattedPrinter);
    }

    public static void print(Printable printable) {
        printable.print();
    }

    public static class ConsolePrinter implements Printable {
        @Override
        public void print() {
            System.out.println(this);
        }

        @Override
        public String toString() {
            return "I'm ConsolePrinter " + hashCode();
        }
    }

}
