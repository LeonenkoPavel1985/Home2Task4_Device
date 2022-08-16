package org.example;

public class Kettle extends Device {

    public Kettle (String nameDevice, String soundDevice, String descDevice) {
        super(nameDevice,soundDevice,descDevice);
    }
    @Override
    public void Sound() {
        System.out.println("Device sound: " + soundDevice);
    }
}
