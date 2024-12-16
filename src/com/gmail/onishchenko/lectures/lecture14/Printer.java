package com.gmail.onishchenko.lectures.lecture14;

public class Printer {
    public static void main(String[] args) {
        ConsolePrinter consolePrinter = new ConsolePrinter();
        print(consolePrinter);

        Printable formattedPrinter = new Printable() {
            @Override
            public void print() {
                System.out.println("Formatted: ");
//                System.out.println(this);
            }

            @Override
            public void consolePrint() {
                System.out.println("Console printing...");
                Printable.super.consolePrint();
                System.out.println("Finish console printing...");
            }
        };

        Printable anotherPrinter = () -> {
            System.out.print("Another printer: ");
            System.out.println("some print");
        };

        print(formattedPrinter);
        print(anotherPrinter);

        formattedPrinter.consolePrint();
        anotherPrinter.consolePrint();
    }

    public static void print(Printable printable) {
        printable.print();
    }

    public static class ConsolePrinter implements Printable {
        @Override
        public void print() {
            System.out.println(this);
        }

//        @Override
//        public void anotherMethod() {
//
//        }

        @Override
        public String toString() {
            return "I'm ConsolePrinter " + hashCode();
        }
    }

}
