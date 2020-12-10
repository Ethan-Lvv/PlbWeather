package com.plbstu.plbweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @Author Stacy
 * @Date 2020/12/10 14:21
 * @Version 1.0
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }

}
