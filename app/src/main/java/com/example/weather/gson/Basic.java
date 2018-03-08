package com.example.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hugb on 3/7/18.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public  Update update;
    public class Update {
        @SerializedName("loc")
        public String upateTime;
    }
}
