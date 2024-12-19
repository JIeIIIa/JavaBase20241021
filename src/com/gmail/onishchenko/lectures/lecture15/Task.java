package com.gmail.onishchenko.lectures.lecture15;

public class Task {
    private static final Status[] AVAILABLE_STATUSES = {
            Status.TODO,
            Status.IN_PROGRESS,
            Status.DONE
    };

    private Status status;
    private String description;

    public Task(Status status, String description) {
        setStatus(status);
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "status='" + status + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Status {
        public static final Status TODO = new Status("TODO");
        public static final Status IN_PROGRESS = new Status("IN_PROGRESS");
        public static final Status DONE = new Status("DONE");

        private String name;

        private Status(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
