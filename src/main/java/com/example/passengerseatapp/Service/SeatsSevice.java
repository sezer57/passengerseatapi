package com.example.passengerseatapp.Service;


import com.example.passengerseatapp.Model.Seats;
import com.example.passengerseatapp.Repository.SeatsRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatsSevice {

    private final SeatsRepo seatsRepo;

    public SeatsSevice(SeatsRepo seatsRepo) {
        this.seatsRepo = seatsRepo;
    }


    public List< Seats > findAll() {
        return seatsRepo.findAll();
    }

    public Seats findSeatsById(Integer id) {
        return seatsRepo.findById(id).orElse(null);
    }

    public String findSeatsBy_number_istaken(int numbers){
        Seats a =seatsRepo.findByNumbers(numbers);
        return a.getSeatsIsTaken();
    }
    public Seats findSeatsBy_number(int numbers){
        return seatsRepo.findByNumbers(numbers);
    }
}
