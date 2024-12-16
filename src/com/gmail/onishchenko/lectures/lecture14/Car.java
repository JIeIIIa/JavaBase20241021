package com.gmail.onishchenko.lectures.lecture14;

public class Car {
    private Engine engine;

    public Car() {
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }

    public class Engine {
        private String model;

        public Engine(String model) {
            this.model = model;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "model='" + model + '\'' +
                    '}';
        }
    }
}
