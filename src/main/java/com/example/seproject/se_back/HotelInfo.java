package com.example.seproject.se_back;

import javax.persistence.*;
import java.util.Set;

@Entity
public class HotelInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String country;
    private String city;
    private String street;
    private String building;
    //@OneToMany(mappedBy = "hotel")
    //private Set<PhoneNumber> numbers;
    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public int getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getBuilding() {
        return building;
    }

}
