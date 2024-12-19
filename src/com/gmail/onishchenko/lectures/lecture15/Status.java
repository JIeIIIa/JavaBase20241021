package com.gmail.onishchenko.lectures.lecture15;

public enum Status {
    TODO(7),
    IN_PROGRESS(42),
    DONE(1_000_000);

    Status(int defaultDuration) {
        this.defaultDuration = defaultDuration;
    }

    private int defaultDuration;

    public int getDefaultDuration() {
        return defaultDuration;
    }
}
