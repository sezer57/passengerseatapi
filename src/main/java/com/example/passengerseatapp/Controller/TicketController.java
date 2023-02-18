package com.example.passengerseatapp.Controller;

import com.example.passengerseatapp.Dto.CreatePassengerRequest;
import com.example.passengerseatapp.Model.PassengerSeats;
import com.example.passengerseatapp.Model.Passengers;
import com.example.passengerseatapp.Model.Seats;
import com.example.passengerseatapp.Service.PassengerSeatService;
import com.example.passengerseatapp.Service.PassengerService;
import com.example.passengerseatapp.Service.SeatsSevice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/v1/ticket")
public class TicketController {
    private final SeatsSevice seatsSevice;
    private final PassengerSeatService passengerSeatService;
    private final PassengerService passengerService;

    public TicketController(SeatsSevice seatsSevice, PassengerSeatService passengerSeatService, PassengerService passengerService) {
        this.seatsSevice = seatsSevice;
        this.passengerSeatService = passengerSeatService;
        this.passengerService = passengerService;
    }

    @GetMapping("/seats")
    public ResponseEntity<List> getseats(){
        return ResponseEntity.ok(seatsSevice.findAll());
    }

    @GetMapping("/passengers")
    public ResponseEntity<List> getpassengers(){
        return ResponseEntity.ok(passengerService.findAll());
    }

    @GetMapping("/passengers_seats")
    public ResponseEntity<List> getpassengerseats(){
        return ResponseEntity.ok(passengerSeatService.findAll());
    }

    @PostMapping("/passenger/add")
    public ResponseEntity<PassengerSeats> create(@RequestBody CreatePassengerRequest createPassengerRequest){
        if(seatsSevice.findSeatsBy_r_c(createPassengerRequest.getRow_s(), createPassengerRequest.getColumns_s())==null)
        {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, " not found"
            );
        }
        else if(seatsSevice.findSeatsBy_r_c_istaken(createPassengerRequest.getRow_s(), createPassengerRequest.getColumns_s()).equals("yes"))
        {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "is taken"
            );
        }
        return ResponseEntity.ok(passengerSeatService.create(createPassengerRequest));
    }

}
