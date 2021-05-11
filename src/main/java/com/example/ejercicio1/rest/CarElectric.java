package com.example.ejercicio1.rest;

import com.example.ejercicio1.model.Car;

public class CarElectric extends Car {

    private String rearviewmirror;

    public CarElectric(Long id, String name, String brand, int year, String rearviewmirror) {
        super(id, name, brand, year, new Battery() , new Motor(), new AirConditioner());
        this.rearviewmirror = rearviewmirror;
    }

    public String getRearviewmirror() {
        return rearviewmirror;
    }

    public void setRearviewmirror(String rearviewmirror) {
        this.rearviewmirror = rearviewmirror;
    }

    CarFacade facade = new CarFacade();


}
