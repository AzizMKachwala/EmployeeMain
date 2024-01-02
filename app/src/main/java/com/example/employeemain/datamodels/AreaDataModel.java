package com.example.employeemain.datamodels;

import java.io.Serializable;
import java.util.List;

public class AreaDataModel implements Serializable {

    String AreaName;
    List<MemberDataModel> memberLists;

    public AreaDataModel() {
    }

    public AreaDataModel(String areaName) {
        AreaName = areaName;
    }

    public String getAreaName() {
        return AreaName;
    }

    public void setAreaName(String areaName) {
        AreaName = areaName;
    }

    public List<MemberDataModel> getMemberLists() {
        return memberLists;
    }

    public void setMemberLists(List<MemberDataModel> memberLists) {
        this.memberLists = memberLists;
    }
}
