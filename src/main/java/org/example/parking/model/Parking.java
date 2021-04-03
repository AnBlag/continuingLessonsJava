package org.example.parking.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Parking {
    private Integer capacity = 20;
    private List<Car> carParking;
    private Random random;

    public void addCar(Car car) {
        if (capacity <= 20) {
            carParking.add(random.nextInt(19), car);
            if (this.random != null) {
                carParking.add(car);
                capacity--;
            }
        } else if (capacity >= 20) {
            try {
                throw new ArrayIndexOutOfBoundsException("Парковка заполнена. Приезжайте позже.");
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }

        }
    }
    public void leaveTheParking (Car car) {
        if (capacity <= 0) {
            try {
                throw new ArrayIndexOutOfBoundsException("Парковка свободна. Уезжать некому.");
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
        else carParking.remove(car);
    }
}


