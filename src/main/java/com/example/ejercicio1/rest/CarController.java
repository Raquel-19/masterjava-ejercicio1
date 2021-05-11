package com.example.ejercicio1.rest;

import com.example.ejercicio1.model.Car;
import com.example.ejercicio1.services.CarNotFoundException;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;

@Path("/car")
@Component

public class CarController {


    @GET
    @Path("{type}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findOne(@PathParam("type") String type) {
         try {
        return Response.ok (CarFacade.createCar(type)).build();
        } catch (CarNotFoundException e) {
            e.printStackTrace();
        }
        return Response.status(404).build();

    }

    @GET
    @Path("/allcars")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Car> findAll() throws CarNotFoundException {
        List<Car> car = Arrays.asList(
                CarFacade.createCar ("hybrid"),
                CarFacade.createCar ("combustion"),
                CarFacade.createCar ("electric")
        );
        return car;
    }
}

