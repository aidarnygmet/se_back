package com.example.seproject.se_back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {
    @Autowired
    private HotelRepo hotelRepo;

    @RequestMapping ("/hotel")
    public List<Hotel> listAll(Model model){
        List<Hotel> listHotels = hotelRepo.findAll();
        model.addAttribute("listHotels", listHotels);
        return listHotels;
    }

    public String getHotel(){
        return "shit";
    }
}
