package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springboot.demo.mycoolapp.common.Coach;

@RestController
public class DemoController {
    //define a private field for dependency
    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("cricketcoach") Coach theCoach){
        myCoach = theCoach;

    }

    @GetMapping(value = "/daily-workout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
