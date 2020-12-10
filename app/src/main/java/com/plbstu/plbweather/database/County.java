package com.plbstu.plbweather.database;

import org.litepal.crud.DataSupport;

/**
 * @Author Stacy
 * @Date 12/9/20 12:53 PM
 * @Version 1.0
 */
public class County extends DataSupport {

    private int id;
    private String countyName;  // 县名称
    private String weatherId; // 当前县天气id
    private int cityId;  // 当前县对应市id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
