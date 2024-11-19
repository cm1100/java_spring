package com.luv2code.springboot.demo.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component("baseballcoach")
public class BaseBallCoach implements Coach{
    BaseBallCoach(){
        System.out.println("initilizing base ball");
    }

    @Override
    public String  getDailyWorkout(){
        return "throw ball for 20 minutes";
    }

}
