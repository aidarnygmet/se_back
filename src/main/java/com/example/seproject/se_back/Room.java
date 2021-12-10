package com.example.seproject.se_back;

import javax.persistence.*;

@Entity
@Table(name="room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int room_id;
    private int id;
    private String room_number;
    private int room_floor;
    private int room_type;

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }

    public void setRoom_floor(int room_floor) {
        this.room_floor = room_floor;
    }

    public void setRoom_type(int room_type) {
        this.room_type = room_type;
    }

    public int getRoom_id() {
        return room_id;
    }

    public int getId() {
        return id;
    }

    public String getRoom_number() {
        return room_number;
    }

    public int getRoom_floor() {
        return room_floor;
    }

    public int getRoom_type() {
        return room_type;
    }
}
