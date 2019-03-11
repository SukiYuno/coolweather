package com.coolweather.android.gson;

import android.view.textservice.SuggestionsInfo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by hcm on 2019/3/7.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
