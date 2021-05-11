package com.example.ejercicio1.model;

import com.example.ejercicio1.rest.AirConditioner;
import com.example.ejercicio1.rest.Battery;
import com.example.ejercicio1.rest.Motor;

public class Car {

    private Long id;
    private String name;
    private String brand;
    private int year;
    private Battery battery;
    private Motor motor;
    private AirConditioner air;


    public Car(Long id, String name, String brand, int year, Battery battery, Motor motor, AirConditioner air) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.year = year;
        this.battery = battery;
        this.motor = motor;
        this.air = air;

        this.battery.onBattery();
        this.motor.startEngine();
        this.air.onAir();
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public AirConditioner getAir() {
        return air;
    }

    public void setAir(AirConditioner air) {
        this.air = air;
    }

    public Car () {}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", battery=" + battery +
                ", motor=" + motor +
                ", air=" + air +
                '}';
    }

}
