package com.example.ejercicio1.rest;

import com.example.ejercicio1.model.Car;
import com.example.ejercicio1.services.CarNotFoundException;

public class CarFacade {

    public static Car createCar (String type) throws CarNotFoundException {
        switch (type) {
            case "hybrid":
                return new CarHybrid(1l, "HIBRIDO", "Seat", 2020, "Con Bluetooth");
            case "combustion":
                return new CarCombustion(2L, "COMBUSTION", "Ferrari", 2019, "Con Internet");
            case "electric":
                return new CarElectric(3L, "ELECTRICO", "Mini", 2018, "Espejo retrovisor interior");

            default:
                throw new CarNotFoundException("404");
        }
    }
}
