package com.guitarbros.java;

public class FenderStratocaster extends AbstractElectric {

    private static final long prefix = 113243;

    public FenderStratocaster(GuitarColor color, GuitarStrings strings) {
        super(strings, color);
        upc = 1234;
        setSerialUPC(SerialNumbers.getInstance(prefix, upc).getNextSerial());
    }

    @Override
    public long getPrefix() {return prefix;}

    @Override
    public float getPrice() {return 700F;}

    @Override
    public String getFretBoard() {return fretBoard;}

    @Override
    public String getAmp() {return amp;}

}
