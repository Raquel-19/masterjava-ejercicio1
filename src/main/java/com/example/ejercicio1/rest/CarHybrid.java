package com.example.ejercicio1.rest;

import com.example.ejercicio1.model.Car;

public class CarHybrid extends Car {

    private String gps;


    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public CarHybrid(Long id, String name, String brand, int year, String gps) {
        super(id, name, brand, year, new Battery(), new Motor(), new AirConditioner());
        this.gps = gps;

    }

    CarFacade facade = new CarFacade();

}