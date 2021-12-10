package com.example.seproject.se_back;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@RestController
public class HotelInfoController{
    @PersistenceContext
    private EntityManager entityManager;
    @GetMapping("/hotelInfo")
    public List<HotelInfo> queryHotels(){
        Query query=entityManager.createQuery("SELECT h.id, h.name, s.country, s.city, s.street, s.building FROM Hotel h, Address s WHERE h.id=s.id");
        return query.getResultList();
    }
}
