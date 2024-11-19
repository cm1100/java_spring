package com.luv2code.springboot.demo.mycoolapp.common;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("cricketcoach")
public class CricketCoach implements Coach {

    @PostConstruct
    public void startupStuff(){
        System.out.println("do startup");
    }

    @Override
    public String getDailyWorkout(){

        return "Practice fast bowling for 15 mins !!!!!!";
    }

    @PreDestroy
    public void cleanStuff(){
        System.out.println("do cleanup");
    }

}
