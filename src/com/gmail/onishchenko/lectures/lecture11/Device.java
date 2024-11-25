package com.gmail.onishchenko.lectures.lecture11;

public class Device {
    String imei;
    String name;

//    public Device() {
//        imei = "NO IMEI";
//    }

    public Device(String deviceImei) {
        imei = deviceImei;
    }

//    public Device(String deviceName) {
//        name = deviceName;
//    }

    public Device(String deviceImei, String deviceName) {
        imei = deviceImei;
        name = deviceName;
    }

    public void describe() {
        System.out.println(name + " has imei == " + imei);
    }
}
