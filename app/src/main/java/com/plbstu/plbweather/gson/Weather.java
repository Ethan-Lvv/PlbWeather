package com.plbstu.plbweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Author Stacy
 * @Date 2020/12/10 14:25
 * @Version 1.0
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
