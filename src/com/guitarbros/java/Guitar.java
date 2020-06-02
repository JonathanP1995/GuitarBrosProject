package com.guitarbros.java;

public class Guitar {

    private String guitarType;
    private int guitarCount;
    private String thingType;


    public Guitar(String guitarType, String thingType, int guitarCount) {

        this.guitarType = guitarType;
        this.guitarCount = guitarCount;
        this.thingType = thingType;
    }// end constructor*/


    protected void setGuitarType(String value) {
        guitarType = value;
    }

    protected String getGuitarType() {
        return guitarType;
    }

    protected void setThingType(String value) {
        thingType = value;
    }

    protected String getThingType() {
        return thingType;
    }


    protected void setOrderSize(int value) {
        guitarCount = value;
    }
    protected int getOrderSize() {
        return guitarCount;
    }
    
}
