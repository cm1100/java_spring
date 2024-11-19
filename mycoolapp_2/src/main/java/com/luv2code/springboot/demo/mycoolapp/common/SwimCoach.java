package com.luv2code.springboot.demo.mycoolapp.common;


public class SwimCoach implements Coach {

    public SwimCoach(){
        System.out.println("in construct " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "swim 100 hours";
    }

}
