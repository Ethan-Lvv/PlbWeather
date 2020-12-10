package com.plbstu.plbweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @Author Stacy
 * @Date 12/9/20 1:20 PM
 * @Version 1.0
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }

}
