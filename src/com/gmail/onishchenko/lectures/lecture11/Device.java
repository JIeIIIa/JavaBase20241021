package com.gmail.onishchenko.lectures.lecture11;

public class Device {
    String imei;
    String name;

    public Device() {
        imei = "NO IMEI";
    }

    public Device(String imei) {
        this.imei = imei;
    }

//    public Device(String deviceName) {
//        name = deviceName;
//    }

    public Device(String imei, String deviceName) {
//        this();
        this(imei);

        Device device = new Device();
        name = deviceName;
    }

    public void describe() {
        System.out.println(this.name + " has imei == " + this.imei);
    }
}
