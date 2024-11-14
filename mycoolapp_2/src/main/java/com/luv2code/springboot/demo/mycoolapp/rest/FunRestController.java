package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


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