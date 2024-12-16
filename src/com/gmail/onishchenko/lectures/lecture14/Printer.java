package com.gmail.onishchenko.lectures.lecture14;

public class Printer {
    public static void main(String[] args) {
        ConsolePrinter consolePrinter = new ConsolePrinter();
        print(consolePrinter);

        class FormattedPrinter implements Printable {

            @Override
            public void print() {
                System.out.print("Formatted: ");
                System.out.println(this);
            }
        }

        FormattedPrinter formattedPrinter = new FormattedPrinter();
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
