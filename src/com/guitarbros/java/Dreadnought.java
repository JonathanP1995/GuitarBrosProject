package com.guitarbros.java;

public class Dreadnought extends AbstractAcoustic {

    private static final long prefix = 353401;

    public Dreadnought(GuitarColor color, GuitarStrings strings) {
        super(strings, color);
        upc = 1234;
        setSerialUPC(SerialNumbers.getInstance(prefix, upc).getNextSerial());
    }

    @Override
    public long getPrefix() {return prefix;}

    @Override
    public float getPrice() {return 200F;}

    @Override
    public String getFretBoard() {return fretBoard;}
}
