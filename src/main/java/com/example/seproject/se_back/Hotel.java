package com.example.seproject.se_back;
import javax.persistence.*;

@Entity
@Table(name="hotel")
public class Hotel {
    @Id
    private int id;
    private String name;
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
}
