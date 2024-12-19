package com.gmail.onishchenko.lectures.lecture15;

public class TaskDemo {
    public static void main(String[] args) {
        Task task = new Task(Status.TODO, "learn Java");
        System.out.println("Primary task is: " + task);
        System.out.println("Expected duration: " + task.getStatus().getDefaultDuration());
        task.setStatus(Status.IN_PROGRESS);
        System.out.println("Expected duration after status was changed: " + task.getStatus().getDefaultDuration());
//        task.setStatus(new Task.Status("FAKE STATUS")); // error! constructor is private
//        System.out.println("Changed status is " + task.getStatus());
    }
}
