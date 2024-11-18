package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/old")
public class FunRestController {

    // inject properties for coach name and team name

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;


    //expose new ednoint
    @GetMapping("/team-info")
    public String teamInfo(){
        return teamName+" "+coachName+"hi";
    }

    //expose a / endpoint which will return hello world
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/new")
    public String sayWrokout(){

        return "Wrorkout Donesjhjsh";
    }
}
