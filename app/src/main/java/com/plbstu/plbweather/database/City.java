package com.plbstu.plbweather.database;

import org.litepal.crud.DataSupport;

/**
 * @Author Stacy
 * @Date 12/9/20 12:51 PM
 * @Version 1.0
 */
public class City extends DataSupport {

    private int id;
    private String cityName;  // 市名称
    private int cityCode;  // 市代码
    private int provinceId;  // 当前市对应省id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
