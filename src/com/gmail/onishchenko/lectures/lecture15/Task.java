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

}
