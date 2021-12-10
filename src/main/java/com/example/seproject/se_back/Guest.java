package com.example.seproject.se_back;

import javax.persistence.*;

@Entity
@Table(name="guest")
public class Guest {
    public int getId() {
        return id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHome_phone(String home_phone) {
        this.home_phone = home_phone;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public void setIdentification_number(int identification_number) {
        this.identification_number = identification_number;
    }

    public void setIdentification_type(String identification_type) {
        this.identification_type = identification_type;
    }

    public String getAddress() {
        return address;
    }

    public String getHome_phone() {
        return home_phone;
    }

    public String getMobile_phone() {
        return mobile_phone;
    }

    public int getIdentification_number() {
        return identification_number;
    }

    public String getIdentification_type() {
        return identification_type;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String identification_type;
    private int identification_number;
    private String mobile_phone;
    private String home_phone;
    private String address;

}
