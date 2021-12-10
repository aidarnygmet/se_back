package com.example.seproject.se_back;

import javax.persistence.*;

@Entity
@Table(name="reservations")
public class Reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int guest_id;
    private String type_id;
    private String check_in;

    public void setId(int id) {
        this.id = id;
    }

    public void setGuest_id(int guest_id) {
        this.guest_id = guest_id;
    }

    public void setType_id(String type_id) {
        this.type_id = type_id;
    }

    public void setCheck_in(String check_in) {
        this.check_in = check_in;
    }

    public void setCheck_out(String check_out) {
        this.check_out = check_out;
    }

    public int getId() {
        return id;
    }

    public int getGuest_id() {
        return guest_id;
    }

    public String getType_id() {
        return type_id;
    }

    public String getCheck_in() {
        return check_in;
    }

    public String getCheck_out() {
        return check_out;
    }

    private String check_out;


}
