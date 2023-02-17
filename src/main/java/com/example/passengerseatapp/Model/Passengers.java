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

    private String name;
    private int tc;

    public Passengers( String name, int tc) {

        this.name = name;
        this.tc = tc;
    }
}
