package com.gmail.onishchenko.lectures.lecture15;

public class TaskDemo {
    public static void main(String[] args) {
        Task task = new Task("TODO", "learn Java");
        System.out.println("Primary task is: " + task);
        task.setStatus("FAKE STATUS");
        System.out.println("Changed status is " + task.getStatus());
    }
}
