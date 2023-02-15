package com.example.passengerseatapp.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Entity
@Data
@Getter
@Setter
@Table(name = "passengers")
public class Passengers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne
    @JoinColumn(name = "passenger_id", referencedColumnName = "id")
    private Seats seats;

    private int name;
    private int tc;
}
