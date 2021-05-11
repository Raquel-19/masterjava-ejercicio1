package com.example.ejercicio1.rest;

public class Battery {

    private String readBattery;

    public String onBattery() {
        return this.readBattery = "Bateria encendida";

    }

    public Battery() { }

    public String getReadBattery() {
        return readBattery;
    }

    public void setReadBattery(String readBattery) {
        this.readBattery = readBattery;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "readBattery='" + readBattery + '\'' +
                '}';
    }
}
