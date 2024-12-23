package com.gmail.onishchenko.lectures.lecture15;

public enum Status implements Runnable {
    TODO(7) ,
    IN_PROGRESS(42),
    DONE(1_000_000) {
        private static final String MESSAGE = "ALL DONE)";

        @Override
        public void run() {
            System.out.println(MESSAGE);
        }
    };

    Status(int defaultDuration) {
        this.defaultDuration = defaultDuration;
    }

    private int defaultDuration;

    public int getDefaultDuration() {
        return defaultDuration;
    }

    @Override
    public void run() {
        System.out.println("Running...");
    }
}
