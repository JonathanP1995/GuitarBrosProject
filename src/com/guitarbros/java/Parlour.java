package com.guitarbros.java;

public abstract class Parlour extends AcousticOptionFactory1 {

    private static final long prefix = 3333;

    public Parlour() {
        upc = 5678;
        setSerialUPC(SerialNumbers.getInstance(prefix, upc).getNextSerial());
    }

    @Override
    public  long getPrefix() {
        return prefix;
    }

    @Override
    public String getHollowBody() {
        return "Guitar parts of the Acoustic. ";
    }

    @Override
    public String getSoundHole() {
        return "Guitar parts of the Acoustic. ";
    }

    @Override
    public String getSaddle() {
        return "Guitar parts of the Acoustic. ";

    }

}
