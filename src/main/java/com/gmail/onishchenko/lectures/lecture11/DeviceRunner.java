package com.gmail.onishchenko.lectures.lecture11;

public class DeviceRunner {
    public static void main(String[] args) {
        Device device = new Device("imei-0001", "First device");
        device.describe();

        Device anotherDevice = new Device("007");
//        anotherDevice.imei = "007";
        anotherDevice.name = "anotherDevice";
        anotherDevice.describe();

        Device fake = device;
        fake.describe();
        fake.name = "FAKE";
        fake.describe();
        device.describe();

//        Device defaultDevice = new Device();

    }
}
