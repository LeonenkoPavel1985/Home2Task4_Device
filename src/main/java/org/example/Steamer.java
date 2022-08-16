package org.example;

public class Steamer extends  Device {

    public Steamer (String nameDevice, String soundDevice, String descDevice) {
        super(nameDevice,soundDevice,descDevice);
    }
    @Override
    public void Sound() {
        System.out.println("Device sound: " + soundDevice);
    }
}
