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
        Seats a1 = seatsRepo.save(new Seats(1,"false"));
        Seats a2 = seatsRepo.save(new Seats(2,"false"));
        Seats a3= seatsRepo.save(new Seats(3,"false"));
        Seats a4= seatsRepo.save(new Seats(4,"false"));
        Seats a5= seatsRepo.save(new Seats(5,"false"));
        Seats a6= seatsRepo.save(new Seats(6,"false"));
        Seats a7= seatsRepo.save(new Seats(7,"false"));
        Seats a8= seatsRepo.save(new Seats(8,"false"));
        Seats a9= seatsRepo.save(new Seats(9,"false"));
        Seats a10= seatsRepo.save(new Seats(10,"false"));
        Seats a11= seatsRepo.save(new Seats(11,"false"));
        Seats a12= seatsRepo.save(new Seats(12,"false"));
    }
}
