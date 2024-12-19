package com.gmail.onishchenko.lectures.lecture15;

import java.util.Arrays;

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


        if (Status.DONE == currentStatus) {
            System.out.println("Status is DONE!");
        }

        Status[] availableStatus = Status.values();
        System.out.println("Available statuses: " + Arrays.toString(availableStatus));
        System.out.printf("%s has an ordinal == %d\n", currentStatus.name(), currentStatus.ordinal());
        Status anotherStatus = Status.valueOf("TODO");
        System.out.println("Another status from String is: " + anotherStatus);

        switch (anotherStatus) {
            case TODO:
                System.out.println("TODO behaviour");
                break;
            default:
                System.out.println("Unknown behaviour");
                break;
        }

//        task.setStatus(new Task.Status("FAKE STATUS")); // error! constructor is private
//        System.out.println("Changed status is " + task.getStatus());
    }
}
