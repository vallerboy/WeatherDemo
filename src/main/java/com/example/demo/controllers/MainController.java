package com.example.demo.controllers;


import com.example.demo.models.WeatherModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @PostMapping("/")
    public  String index(@RequestParam("city") String city, Model model){
        String link   = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=ef2028e98b54649bf1f4c4582631f350";

        RestTemplate restTemplate = new RestTemplate();
        WeatherModel weatherModel = restTemplate.getForObject(link, WeatherModel.class);

        model.addAttribute("temp", weatherModel.getMain().getTemp());
        return "index";
    }
}
