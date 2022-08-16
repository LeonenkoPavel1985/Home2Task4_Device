package org.example;

public abstract class Device {
    String nameDevice; // Наименование устройства.
    String soundDevice; // Звук издаваемый устройством.
    String descDevice; // Описание устройства.

    public Device (String nameDevice, String soundDevice, String descDevice) {
        this.nameDevice = nameDevice;
        this.soundDevice = soundDevice;
        this.descDevice = descDevice;
    }

    public abstract void Sound();

    public void Show() {
        System.out.println("Device name: " + nameDevice);
    }

    public void Desc() {
        System.out.println("Device description: " + descDevice);
    }
}
