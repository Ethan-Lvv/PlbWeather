package com.plbstu.plbweather.database;

import org.litepal.crud.DataSupport;

/**
 * @Author Stacy
 * @Date 12/9/20 12:36 PM
 * @Version 1.0
 */
public class Province extends DataSupport {

    private int id;
    private String provinceName;   // 省份名
    private int provinceCode;   // 省份代码

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
