package com.example.seproject.se_back;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="reservations")
public class Reservations {
    @Id
    private int id;
    private int guest_id;
    private int type_id;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date check_in;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date check_out;

    public void setId(int id) {
        this.id = id;
    }

    public void setGuest_id(int guest_id) {
        this.guest_id = guest_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public void setCheck_in(Date check_in) {
        this.check_in = check_in;
    }

    public void setCheck_out(Date check_out) {
        this.check_out = check_out;
    }

    public int getId() {
        return id;
    }

    public int getGuest_id() {
        return guest_id;
    }

    public int getType_id() {
        return type_id;
    }

    public Date getCheck_in() {
        return check_in;
    }

    public Date getCheck_out() {
        return check_out;
    }



}
