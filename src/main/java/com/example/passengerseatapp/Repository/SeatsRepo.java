package com.example.passengerseatapp.Repository;

import com.example.passengerseatapp.Model.Seats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatsRepo extends JpaRepository<Seats, Integer> {
}
