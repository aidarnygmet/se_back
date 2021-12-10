package com.example.seproject.se_back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    private AddressRepo hotelAddressRepo;
    @GetMapping("/hotelAddress")
    public List<Address> listHotelAddresses(Model model){
        List<Address> listHotelAddresses = hotelAddressRepo.findAll();
        model.addAttribute("listHotels", listHotelAddresses);
        return listHotelAddresses;
    }

}
