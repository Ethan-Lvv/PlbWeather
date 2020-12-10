package com.plbstu.plbweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @Author Stacy
 * @Date 2020/12/10 14:09
 * @Version 1.0
 */
public class Basic {

    /**
     * 使用注解将JSON与Java字段建立映射
     */

    @SerializedName(value = "city")
    public String cityName;

    @SerializedName(value = "id")
    public String  weatherId;

    public Update update;

    public class Update {

        @SerializedName(value = "loc")
        public String updateTime;

    }

}
