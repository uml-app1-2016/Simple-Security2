package com.stevenscheffelaar.simple_security;

/**
 * Created by Steven on 11/16/2016.
 */

public class Light {
    private int LightNum;
    private String OnCode;
    private String OffCode;
    private String LightName;

    public Light() {

    }

    public Light(int lightNum, String onCode, String offCode, String name) {
        this.LightNum =lightNum;
        this.OnCode = onCode;
        this.OffCode = offCode;
        this.LightName = name;
    }

    public int getLightNum() { return this.LightNum; }

    public void setLightNum(int num) { this.LightNum = num; }

    public String getOnCode() { return this.OnCode; }

    public void setOnCode(String code) { this.OnCode = code; }

    public String getOffCode() { return this.OffCode; }

    public void  setOffCode(String code) { this.OffCode = code; }

    public String getLightName() { return  this.LightName; }

    public void setLightName(String name) { this.LightName = name; }
}
