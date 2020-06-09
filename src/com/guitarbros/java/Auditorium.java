package com.guitarbros.java;

public class Auditorium extends AbstractAcoustic {

    private static final long prefix = 353860;

    public Auditorium(GuitarColor color, GuitarStrings strings) {
        super(strings, color);
        upc = 1234;
        setSerialUPC(SerialNumbers.getInstance(prefix, upc).getNextSerial());
    }

    @Override
    public long getPrefix() {return prefix;}

    @Override
    public float getPrice() {return 400F;}

    @Override
    public String getFretBoard() {return fretBoard;}

}
