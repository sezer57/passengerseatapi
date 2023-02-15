package com.example.passengerseatapp.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table(name = "passengerseats")
public class PassengerSeats {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;



}
