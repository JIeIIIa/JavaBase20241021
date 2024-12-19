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

        Printable customFormattedPrinter = new FormattedPrinter();
        ((FormattedPrintable) customFormattedPrinter).formattedPrint();
        customFormattedPrinter.print();

        severalInterfaces();
        staticMethodsInDifferentClasses();
    }

    private static void staticMethodsInDifferentClasses() {
        System.out.println(" -= staticMethodsInDifferentClasses DEMO =-");
        ConsolePrinter printer = new PrettyConsolePrinter();
        printer.print();
        printer.dangerMethod();
    }

    private static void severalInterfaces() {
        System.out.println(" -= severalInterfaces DEMO =-");
        EmailSender consolePrinter = new ConsolePrinter();
        consolePrinter.print();
    }

    public static void print(Printable printable) {
        printable.print();
    }

    public static class ConsolePrinter implements Printable, EmailSender {
        public static void dangerMethod() {
            System.out.println("Call dangerMethod in ConsolePrinter");
        }

        @Override
        public void print() {
            System.out.println(this);
        }

        @Override
        public void consolePrint() {
            EmailSender.super.consolePrint();
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

    public static class PrettyConsolePrinter extends ConsolePrinter {
        public static void dangerMethod() {
            System.out.println("Call dangerMethod in PrettyConsolePrinter");
        }

        @Override
        public void print() {
            System.out.println("Call print in PrettyConsolePrinter");
        }
    }
}

class FormattedPrinter implements FormattedPrintable {

    @Override
    public void print() {
        System.out.println("Call print method...");
    }

    @Override
    public void formattedPrint() {
        System.out.println("Call formattedPrint method...");

    }
}
