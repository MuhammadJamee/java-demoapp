package com.ms.simpleapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "${app.url}"+"/test")
public class HomeController {

    @GetMapping(value = "/home")
    public String home(){
        return "welcome to my simple app!!";
    }
}
