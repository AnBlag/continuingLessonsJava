package org.example.parking.controller;

import org.example.parking.model.Car;
import org.example.parking.model.Parking;
import org.springframework.web.bind.annotation.*;


@RestController
public class ControllerForParking {
    private Parking parking;

    public ControllerForParking(Parking parking) {
        this.parking = parking;
    }



    @GetMapping("/")
    public String getParking() {
        return String.valueOf(parking.getCarParking().size());
    }

    @PostMapping("/add")
    public void parkTheCar( @RequestBody  Car car) {
        parking.addCar(car);
    }

    @DeleteMapping("/delete")
    public void leaveCarTheParking( @RequestBody Car car) {
        parking.leaveTheParking(car);
    }
}
