package com.example.weatherapp;

import java.io.Serializable;

public class Unit implements Serializable {

    private int unitId;
    private String unitName;
    private double conversionToBase;
    private double conversionFromBase;

    public Unit(int unitId, String unitName, double conversionToBase, double conversionFromBase) {
        this.unitId = unitId;
        this.unitName = unitName;
        this.conversionToBase = conversionToBase;
        this.conversionFromBase = conversionFromBase;
    }

    public Unit(int unitId, String unitName) {
        this.unitId = unitId;
        this.unitName = unitName;
    }


    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public double getConversionToBase() {
        return conversionToBase;
    }

    public double getConversionFromBase() {
        return conversionFromBase;
    }
}
