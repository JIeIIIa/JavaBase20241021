package com.gmail.onishchenko.lectures.lecture11;

public class DeviceRunner {
    public static void main(String[] args) {
        Device device = new Device();
        device.imei = "imei-0001";
        device.name = "First device";
        describe(device);

        Device anotherDevice = new Device();
        anotherDevice.imei = "007";
        anotherDevice.name = "anotherDevice";
        describe(anotherDevice);

    }

    public static void describe(Device device) {
        System.out.println(device.name + " has imei == " + device.imei);
    }
}
