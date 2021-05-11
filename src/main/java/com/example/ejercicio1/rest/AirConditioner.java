package com.example.ejercicio1.rest;

public class AirConditioner {

    private String readAir;

    public String onAir () {
        return this.readAir = "Aire acondicionado encendido";
    }
    public AirConditioner () {
    }

    public String getReadAir() {
        return readAir;
    }

    public void setReadAir(String readAir) {
        this.readAir = readAir;
    }

    @Override
    public String toString() {
        return "AirConditioner{" +
                "readAir='" + readAir + '\'' +
                '}';
    }
}
