package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springboot.demo.mycoolapp.common.Coach;

@RestController
@RequestMapping(value ="/v2")
public class DemoSetter {
     private Coach myCoach;

    @Autowired
    public void setCoach(@Qualifier("swimCoach") Coach theCoach){
        System.out.println("working");
        myCoach=theCoach;
    }

    @GetMapping(value = "/daily-workout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
