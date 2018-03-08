package com.example.weather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by hugb on 3/7/18.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
