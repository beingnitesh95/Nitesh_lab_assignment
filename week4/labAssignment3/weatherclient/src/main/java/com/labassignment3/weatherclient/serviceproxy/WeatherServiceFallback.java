package com.labassignment3.weatherclient.serviceproxy;

import org.springframework.stereotype.Component;

@Component
public class WeatherServiceFallback implements WeatherServiceProxy {

        @Override
        public String getWeatherInfo(int temp) {
            return "Weather is not found";
        }
    }
