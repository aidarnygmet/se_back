package com.example.seproject.se_back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PhoneNumberController {
    @Autowired
    private PhoneNumberRepo phoneNumberRepo;
    @GetMapping("/phonenumber")
    public List<PhoneNumber> listNumbers(Model model){
        List<PhoneNumber> listPhoneNumbers=phoneNumberRepo.findAll();
        return listPhoneNumbers;
    }
}

