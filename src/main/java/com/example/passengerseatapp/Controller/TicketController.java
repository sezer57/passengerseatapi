package com.example.passengerseatapp.Controller;

import com.example.passengerseatapp.Model.Seats;
import com.example.passengerseatapp.Service.SeatsSevice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/v1/seats")
public class TicketController {
    private final SeatsSevice seatsSevice;

    public TicketController(SeatsSevice seatsSevice) {
        this.seatsSevice = seatsSevice;
    }

    @GetMapping
    public ResponseEntity<List> getseats(){
        return ResponseEntity.ok(seatsSevice.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Seats> getseats(@PathVariable Integer id){
        return ResponseEntity.ok(seatsSevice.findSeatsById(id));
    }

}
