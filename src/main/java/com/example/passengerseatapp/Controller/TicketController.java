package com.example.passengerseatapp.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/seats")
public class TicketController {

    @GetMapping
    public ResponseEntity<String> getseats(){
        return ResponseEntity.ok("1,2,3,4,5,6,7,8");
    }

}
