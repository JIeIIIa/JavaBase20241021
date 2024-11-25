package com.gmail.onishchenko.lectures.lecture11;

public class DeviceRunner {
    public static void main(String[] args) {
        Device device = new Device();
        device.imei = "imei-0001";
        device.name = "First device";
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

    }
}
