package com.coolweather.coolweather.app.model;

/**
 * Created by Administrator on 2015/1/29.
 */
public class Province {
    private int id;
    private String provinceName;

    public String getProvinceCode() {
        return ProvinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        ProvinceCode = provinceCode;
    }

    public String getProvinceName() {

        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String ProvinceCode;
}
