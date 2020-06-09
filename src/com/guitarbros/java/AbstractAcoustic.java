package com.guitarbros.java;


public abstract class AbstractAcoustic extends AbstractGuitar {
    protected AbstractAcoustic(GuitarStrings strings, GuitarColor color) {
        super(strings, color);
    }

    protected AbstractAcoustic() {
        this(GuitarStrings.steel, GuitarColor.solid);
    }
}
