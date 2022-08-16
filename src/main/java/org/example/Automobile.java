package org.example;

public class Automobile extends Device {

    public Automobile (String nameDevice, String soundDevice, String descDevice) {
        super(nameDevice,soundDevice,descDevice);
    }
    @Override
    public void Sound() {
        System.out.println("Device sound: " + soundDevice);
    }
}
