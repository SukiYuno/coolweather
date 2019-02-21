package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by hcm on 2019/2/21.
 */

public class City extends DataSupport {

    private int id;

    //市名
    private String cityName;

    //市代号
    private int cityCode;

    //所属省ID
    private int provinceId;

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
