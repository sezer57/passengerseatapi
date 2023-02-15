package com.example.passengerseatapp.Model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Entity
@Data
@Getter
@Setter
@Table(name = "seats")
public class Seats {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne(mappedBy = "seats")
    private Passengers passengers;

    private int row;
    private int column;
    boolean seatsIsTaken;


}
