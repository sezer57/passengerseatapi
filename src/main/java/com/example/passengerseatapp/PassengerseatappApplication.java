package com.example.passengerseatapp;

import com.example.passengerseatapp.Model.Seats;
import com.example.passengerseatapp.Repository.SeatsRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PassengerseatappApplication implements CommandLineRunner {
    private final SeatsRepo seatsRepo;

    public PassengerseatappApplication(SeatsRepo seatsRepo) {
        this.seatsRepo = seatsRepo;
    }

    public static void main(String[] args) {
        SpringApplication.run(PassengerseatappApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Seats a = seatsRepo.save(new Seats(1,1,"no"));
        Seats b = seatsRepo.save(new Seats(1,2,"no"));
        Seats c = seatsRepo.save(new Seats(1,3,"no"));
        Seats d = seatsRepo.save(new Seats(1,6,"no"));
        Seats e = seatsRepo.save(new Seats(1,5,"no"));
        Seats r = seatsRepo.save(new Seats(1,9,"no"));
    }
}
