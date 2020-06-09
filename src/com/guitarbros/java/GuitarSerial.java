package com.guitarbros.java;

public class GuitarSerial {

    private GuitarSerial guitar;

    GuitarSerial(GuitarSerial guitar) {
        this.guitar = guitar;
    }

    public void allocatingBikeNumber() {
        SerialNumbers generator = SerialNumbers.getInstance(1234, 5678);
        System.out.println(guitar.getClass().getSimpleName()+
                " Registration Number is " + generator.getNextSerial());
    }

}
