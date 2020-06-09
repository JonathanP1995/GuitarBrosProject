package com.guitarbros.java;

public class Parlour extends AbstractAcoustic {

    private static final long prefix = 353652;

    public Parlour(GuitarColor color, GuitarStrings strings) {
        super(strings, color);
        upc = 1234;
        setSerialUPC(SerialNumbers.getInstance(prefix, upc).getNextSerial());
    }

    @Override
    public long getPrefix() {return prefix;}

    @Override
    public float getPrice() {return 250F;}

    @Override
    public String getFretBoard() {return fretBoard;}
}
