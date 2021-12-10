package com.example.seproject.se_back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@RestController
public class ReservationsController {
    @Autowired
    private ReservationsRepo bookingRepo;
    @PersistenceContext
    private EntityManager entityManager;
    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/booking")
    public List<Reservations> getBooking(Model model){
        List<Reservations> bookingList=bookingRepo.findAll();
        model.addAttribute("listBookingList", bookingList);
        return bookingList;
    }
    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping("/booking")
    public ResponseEntity<Reservations> postBooking(@RequestBody Reservations request){

        Reservations newBooking = bookingRepo.save(request);
        return new ResponseEntity<>(newBooking, HttpStatus.CREATED);

    }
    @CrossOrigin(origins = "http://localhost:8080")
    @PutMapping("/booking:id")
    public Optional<Reservations> putBooking(@PathVariable(value = "id") int res_id, @RequestBody Reservations request){

        return bookingRepo.findById(res_id)
                .map(booking -> {
                    booking.setId(request.getId());
                    booking.setGuest_id(request.getGuest_id());
                    booking.setType_id(request.getType_id());
                    booking.setCheck_in(request.getCheck_in());
                    booking.setCheck_out(request.getCheck_out());
                    return bookingRepo.save(booking);
                });
    }
    @CrossOrigin(origins = "http://localhost:8080")
    @DeleteMapping("/booking:id")
    public ResponseEntity deleteBooking(@PathVariable("id") int id){
        Reservations newres=bookingRepo.findById(id).get();
        bookingRepo.delete(newres);
        return new ResponseEntity<>(newres, HttpStatus.OK);
    }
}

