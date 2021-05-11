package com.example.ejercicio1.rest;

public class Motor {

    private String readMotor;

    public String startEngine () { //Arrancar el motor
        return this.readMotor = "Motor encendido";
    }

    public Motor() {
    }

    public String getReadMotor() {
        return readMotor;
    }

    public void setReadMotor(String readMotor) {
        this.readMotor = readMotor;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "readMotor='" + readMotor + '\'' +
                '}';
    }
}
