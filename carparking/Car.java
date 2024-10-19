package com.yash.carparking;

public class Car {
    private String regNo;
    private String ownerName;
    private int tokenNumber;

    Car(String regNo,String ownerName,int tokenNumber )
    {
        this.regNo=regNo;
        this.ownerName=ownerName;
        this.tokenNumber=tokenNumber;
    }
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public int getTokenNumber() {
        return tokenNumber;
    }

    public void setTokenNumber(int tokenNumber) {
        this.tokenNumber = tokenNumber;
    }
}
