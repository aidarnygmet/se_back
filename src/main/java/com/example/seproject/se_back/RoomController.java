package com.example.seproject.se_back;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomController {
    @Autowired
    private RoomRepo roomRepo;
    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/room")
    public List<Room> getRoom(){
        List<Room> listroom=roomRepo.findAll();
        return listroom;
    }
}
