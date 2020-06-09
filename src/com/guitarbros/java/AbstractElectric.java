package com.guitarbros.java;

public abstract class AbstractElectric extends AbstractGuitar {

    protected AbstractElectric(GuitarStrings strings, GuitarColor color) {
        super(strings, color);
    }

    protected AbstractElectric() {
        this(GuitarStrings.steel, GuitarColor.solid);
    }


}
