package com.example.seproject.se_back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GuestController {
    @Autowired
    private GuestRepo guestRepo;

    @GetMapping("/guest")
    public List<Guest> ListGuests(Model model){
        List<Guest> listGuests = guestRepo.findAll();
        model.addAttribute("listGuests", listGuests);
        return listGuests;
    }

    {}
}
