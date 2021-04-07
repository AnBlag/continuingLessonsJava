package org.example.parking;


import org.example.parking.model.Parking;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;



@SpringBootApplication
public class ParkingApplication {

	@Bean
	public Parking parkingList() {
		return  Parking.builder()
				.carParking(new ArrayList<>())
				.capacity(20)
				.build();
	}

	public static void main(String[] args) {

		SpringApplication.run(ParkingApplication.class, args);
	}

}
