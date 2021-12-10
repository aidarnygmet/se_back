package com.example.seproject.se_back;

import javax.persistence.*;

@Entity
@Table(name="phone_number")
public class PhoneNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String number_id;
    //@ManyToOne
    //@JoinColumn(name="id", nullable=false)
    //private HotelInfo hotel;
    private int id;

    public void setPhone_num(String phone_num) {
        this.number_id = phone_num;
    }

    public void setHotel_id(int hotel_id) {
        this.id = hotel_id;
    }

    public String getPhone_num() {
        return number_id;
    }

    public int getHotel_id() {
        return id;
    }
}
