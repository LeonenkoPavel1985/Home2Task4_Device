package org.example;

public class Microwave extends Device {
    public Microwave (String nameDevice, String soundDevice, String descDevice) {
        super(nameDevice,soundDevice,descDevice);
    }
    @Override
    public void Sound() {
        System.out.println("Device sound: " + soundDevice);
    }
}
