package com.example.ejercicio1.rest;

import com.example.ejercicio1.model.Car;
import com.example.ejercicio1.services.CarNotFoundException;
import javassist.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public abstract class CarFactory {

    CarFacade car = new CarFacade();

}


