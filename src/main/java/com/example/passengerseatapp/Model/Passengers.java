package com.example.passengerseatapp.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotNull;

@Entity
@Data
@Getter
@Setter
@Table(name = "passengers")
public class Passengers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank(message = "isim bos olamaz")
    private String name;

    Long  tc;

    public Passengers(){}
    public Passengers( String name, Long tc) {

        this.name = name;
        this.tc = tc;
    }
}
