package com.example.employeemain.datamodels;

import java.io.Serializable;

public class MemberDataModel implements Serializable {

    String MemberName;

    public void setMemberName(String memberName) {
        MemberName = memberName;
    }

    public String getMemberName() {
        return MemberName;
    }
}
