package com.example.ejercicio1.services;

public class CarNotFoundException extends Exception {
    public CarNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
