package com.labassignment3.weatherclient.serviceproxy;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//@FeignClient(name="wservice", url="localhost:8082")
@FeignClient(name="wservice")
public interface WeatherServiceProxy {
    @GetMapping("weatherservice/{temp}")
    public String getWeatherInfo(@PathVariable int temp);
}

