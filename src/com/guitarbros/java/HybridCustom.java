package com.guitarbros.java;

public class HybridCustom extends AbstractHybrid {

    private static final long prefix = 88097;

    public HybridCustom(GuitarColor color, GuitarStrings strings) {
        super(strings, color);
        upc = 1234;
        setSerialUPC(SerialNumbers.getInstance(prefix, upc).getNextSerial());
    }

    @Override
    public long getPrefix() {return prefix;}

    @Override
    public float getPrice() {return 2000F;}

    @Override
    public String getFretBoard() {return fretBoard;}

}
