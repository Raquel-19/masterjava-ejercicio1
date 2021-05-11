package com.example.ejercicio1.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/api")
@Component
public class CarConfig extends ResourceConfig {

    public CarConfig () {

        packages("com.example.ejercicio1.rest");
    }
}
