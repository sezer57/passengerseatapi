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

    private int numbers;
    private String seatsIsTaken;
    public Seats(){};
    public Seats( int numbers, String seatsIsTaken) {

        this.numbers = numbers;

        this.seatsIsTaken = seatsIsTaken;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", numbers=" + numbers +
                ", seatsIsTaken='" + seatsIsTaken + '\'' +
                '}';
    }
}
