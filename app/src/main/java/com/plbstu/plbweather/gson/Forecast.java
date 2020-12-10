package com.plbstu.plbweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @Author Stacy
 * @Date 2020/12/10 14:23
 * @Version 1.0
 */
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }

}
