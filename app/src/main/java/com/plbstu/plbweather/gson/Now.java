package com.plbstu.plbweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @Author Stacy
 * @Date 2020/12/10 14:18
 * @Version 1.0
 */
public class Now {

    @SerializedName(value = "temp")
    public String temperature;

    @SerializedName(value = "cond")
    public More more;

    public class More {

        @SerializedName(value = "txt")
        public String info;

    }

}
