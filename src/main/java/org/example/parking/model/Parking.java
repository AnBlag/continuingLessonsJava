package org.example.parking.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Parking {
    private Integer capacity = 20;
    private List<Car> carParking;

    public void addCar(Car car) {
        if (capacity <= 20) {
            carParking.add(car);
        }
    }
    public void leaveTheParking (Car car) {
        if (capacity == 0) {
            try {
                throw new ArrayIndexOutOfBoundsException("Парковка свободна. Уезжать некому.");
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
        else carParking.remove(car);
    }
}


