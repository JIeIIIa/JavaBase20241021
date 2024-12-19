package com.gmail.onishchenko.lectures.lecture15;

public class TaskDemo {
    public static void main(String[] args) {
        Task task = new Task(Status.TODO, "learn Java");
        System.out.println("Primary task is: " + task);
        System.out.println("Expected duration: " + task.getStatus().getDefaultDuration());

        System.out.println(" -= IN PROGRESS =-");
        task.setStatus(Status.IN_PROGRESS);
        Status currentStatus = task.getStatus();
        System.out.println("Current status is " + currentStatus);
        System.out.println("Expected duration after status was changed: " + currentStatus.getDefaultDuration());
        currentStatus.run();

        System.out.println(" -= DONE =-");
        task.setStatus(Status.DONE);
        currentStatus = task.getStatus();
        System.out.println("Current status is " + currentStatus);
        System.out.println("Expected duration after status was changed: " + currentStatus.getDefaultDuration());
        currentStatus.run();
//        task.setStatus(new Task.Status("FAKE STATUS")); // error! constructor is private
//        System.out.println("Changed status is " + task.getStatus());
    }
}
