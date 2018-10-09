package com.example.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        String link = "http://api.openweathermap.org/data/2.5/weather?q=Krakow&appid=ef2028e98b54649bf1f4c4582631f350"



    }
}
