package com.labassignment3.weatherclient.controller;


import com.labassignment3.weatherclient.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherClientController {
    private WeatherService weatherService;

    @Autowired
    public WeatherClientController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    //http://localhost:8082/wservice/weatherservice/20
    @GetMapping(path = "weatherservice/{temp}")
    public String getWeatherInfo(@PathVariable int temp) {
        return weatherService.getWeatherInfo(temp);
    }
}