package com.example.seproject.se_back;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class GreetingController{
  @RequestMapping("/")
    public String getGreeting(){
      return "fucking shit";
    }
}
