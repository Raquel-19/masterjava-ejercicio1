package com.example.ejercicio1.rest;

import com.example.ejercicio1.model.Car;

public class CarCombustion extends Car {

    private String radio;

    public CarCombustion(Long id, String name, String brand, int year, String radio) {
        super(id, name, brand, year, new Battery(), new Motor(), new AirConditioner());
        this.radio = radio;
    }

    CarFacade facade = new CarFacade();



    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }
}
