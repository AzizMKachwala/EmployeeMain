package com.example.employeemain.datamodels;

import java.io.Serializable;
import java.util.List;

public class CityDataModel implements Serializable {

    String CityName;
    List<AreaDataModel> areaLists;

    public CityDataModel() {

    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public List<AreaDataModel> getAreaLists() {
        return areaLists;
    }

    public void setAreaLists(List<AreaDataModel> areaLists) {
        this.areaLists = areaLists;
    }
}
