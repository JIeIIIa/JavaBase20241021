package com.gmail.onishchenko.lectures.lecture14;

class PackagePrivateCarRunner  {
    public static void main(String[] args) {

        Car car = new Car("pretty car");
        System.out.println(car);

        Car.Engine engine = car.new Engine("top engine");
        System.out.println(engine);
        car.setEngine(engine);
        System.out.println(car);
    }
}
