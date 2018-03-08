package com.example.weather.gson;

/**
 * Created by hugb on 3/7/18.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
