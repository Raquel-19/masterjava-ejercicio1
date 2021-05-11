package com.example.ejercicio1;

import com.example.ejercicio1.rest.CarCombustion;
import com.example.ejercicio1.rest.CarElectric;
import com.example.ejercicio1.rest.CarHybrid;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.convert.DurationFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ejercicio1Test {


    //TESTING BATERIA
    @Test
    @DisplayName("Test Bateria CarHybrid")
    void testBatteryOn() {
        CarHybrid car = new CarHybrid(1l, "HIBRIDO", "Seat", 2020, "Con Bluetooth");
        car.getBattery().onBattery();
        System.out.println(car.getBattery().getReadBattery());
        assertEquals("Bateria encendida", car.getBattery().getReadBattery());

    }

    @Test
    @DisplayName("Test Bateria CarCombustion")
    void testBatteryOn2() {
        CarCombustion car = new CarCombustion(2L, "COMBUSTION", "Ferrari", 2019, "Con Internet");
        car.getBattery().onBattery();
        System.out.println(car.getBattery().getReadBattery());
        assertEquals("Bateria encendida", car.getBattery().getReadBattery());
    }

    @Test
    @DisplayName("Test Bateria CarElectric")
    void testBatteryOn3() {
        CarElectric car = new CarElectric(3L, "ELECTRICO", "Mini", 2018, "Espejo retrovisor interior");
        car.getBattery().onBattery();
        System.out.println(car.getBattery().getReadBattery());
        assertEquals("Bateria encendida", car.getBattery().getReadBattery());

    }

    //TESTING MOTOR
    @Test
    @DisplayName("Test Motor CarHybrid")
    void testMotorOn() {
        CarHybrid car = new CarHybrid(1l, "HIBRIDO", "Seat", 2020, "Con Bluetooth");
        car.getMotor().startEngine();
        System.out.println(car.getMotor().getReadMotor());
        assertEquals("Motor encendido", car.getMotor().getReadMotor());
    }

    @Test
    @DisplayName("Test Motor CarCombustion")
    void testMotorOn2() {
        CarCombustion car = new CarCombustion(2L, "COMBUSTION", "Ferrari", 2019, "Con Internet");
        car.getMotor().startEngine();
        System.out.println(car.getMotor().getReadMotor());
        assertEquals("Motor encendido", car.getMotor().getReadMotor());
    }

    @Test
    @DisplayName("Test Motor CarElectric")
    void testMotorOn3() {
        CarElectric car = new CarElectric(3L, "ELECTRICO", "Mini", 2018, "Espejo retrovisor interior");
        car.getMotor().startEngine();
        System.out.println(car.getMotor().getReadMotor());
        assertEquals("Motor encendido", car.getMotor().getReadMotor());
    }

    // TESTING AIRE ACONDICIONADO
    @Test
    @DisplayName("Test AirConditioner CarHybrid")
    void AirOn() {
        CarHybrid car = new CarHybrid(1l, "HIBRIDO", "Seat", 2020, "Con Bluetooth");
        car.getAir().onAir();
        System.out.println(car.getAir().getReadAir());
        assertEquals("Aire acondicionado encendido", car.getAir().getReadAir());
    }

    @Test
    @DisplayName("Test AirConditioner CarCombustion")
    void AirOn2() {
        CarCombustion car = new CarCombustion(2L, "COMBUSTION", "Ferrari", 2019, "Con Internet");
        car.getAir().onAir();
        System.out.println(car.getAir().getReadAir());
        assertEquals("Aire acondicionado encendido", car.getAir().getReadAir());
    }
    @Test
    @DisplayName("Test AirConditioner CarElectric")
    void AirOn3 () {
        CarElectric car = new CarElectric(3L, "ELECTRICO", "Mini", 2018, "Espejo retrovisor interior");
        car.getAir().onAir();
        System.out.println(car.getAir().getReadAir());
        assertEquals("Aire acondicionado encendido", car.getAir().getReadAir());
    }
}
