package com.plbstu.plbweather.gson;

/**
 * @Author Stacy
 * @Date 2020/12/10 14:16
 * @Version 1.0
 */
public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }

}
