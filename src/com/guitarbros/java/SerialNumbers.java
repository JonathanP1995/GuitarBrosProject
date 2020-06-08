package com.guitarbros.java;
import java.util.Random;

public class SerialNumbers {

    private static SerialNumbers instance;

    private static long prefix = 0;
    private static long count = 0;

    private SerialNumbers() { }

    public synchronized static SerialNumbers getInstance(long startPrefix, long startCount) {
        if(instance == null) {
            instance = new SerialNumbers();
        }
        prefix = startPrefix;
        count = startCount;
        return instance;
    }

    public synchronized long getNextSerial() {
        String combine = prefix + "" + getRandom(count);
        long finishUPC = Long.parseLong(combine);
        return finishUPC;
    }

    private long getRandom(long value) {
        Random rand = new Random();
        return rand.nextInt(44444 - (int)value) + (long)value;
    }

}

