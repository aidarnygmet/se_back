package com.example.seproject.se_back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReservationsController {
    @Autowired
    private ReservationsRepo bookingRepo;
    @GetMapping("/booking")
    public List<Reservations> getBooking(Model model){
        List<Reservations> bookingList=bookingRepo.findAll();
        model.addAttribute("listBookingList", bookingList);
        return bookingList;
    }
    @PostMapping("/booking")
    public ResponseEntity<Reservations> postBooking(@RequestBody Reservations request){
        Reservations newBooking = bookingRepo.save(request);
        return new ResponseEntity<>(newBooking, HttpStatus.CREATED);
    }
}

