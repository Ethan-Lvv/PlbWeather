package com.plbstu.plbweather.util;

import android.text.TextUtils;

import com.plbstu.plbweather.database.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @Author Stacy
 * @Date 2020/12/10 13:07
 * @Version 1.0
 */
public class Utility {

    /**
     * 解析并处理服务器传来的省级数据
     * @param response
     * @return
     */

    public static boolean handleProvinceResponse(String response) {

        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0; i < allProvinces.length(); i++) {
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();   // 存储到数据库
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析并处理服务器传来的市级数据
     * @param response
     * @param provinceId
     * @return
     */

    public static boolean handleCityResponse(String response, int provinceId) {

        if (!TextUtils.isEmpty(response)) {