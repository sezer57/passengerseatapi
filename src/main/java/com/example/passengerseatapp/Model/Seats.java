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

    private int rows;
    private int columns;
    private String seatsIsTaken;
    public Seats(){};
    public Seats( int row, int column, String seatsIsTaken) {

        this.rows = row;
        this.columns = column;
        this.seatsIsTaken = seatsIsTaken;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", rows=" + rows +
                ", columns=" + columns +
                ", seatsIsTaken='" + seatsIsTaken + '\'' +
                '}';
    }
}
