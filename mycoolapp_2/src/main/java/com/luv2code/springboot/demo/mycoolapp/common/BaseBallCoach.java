package com.luv2code.springboot.demo.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{

    @Override
    public String  getDailyWorkout(){
        return "throw ball for 20 minutes";
    }

}
