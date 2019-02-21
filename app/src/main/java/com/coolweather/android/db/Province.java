package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by hcm on 2019/2/21.
 */

public class Province extends DataSupport {

    private int id;

    //省名
    private String provinceName;

    //省代号
    private int provinceCode;

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
