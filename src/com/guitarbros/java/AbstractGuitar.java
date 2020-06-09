package com.guitarbros.java;
import com.guitarbros.java.GuitarColor;

public abstract class AbstractGuitar implements GuitarInterface {

    private GuitarColor color;
    private GuitarStrings strings;
    protected long upc;
    private long serialUPC;
    protected String fretBoard;
    protected String amp;

    protected AbstractGuitar(GuitarStrings strings, GuitarColor color) {
        this.strings = strings;
        this.color = color;
    }

    protected AbstractGuitar() {
        this(GuitarStrings.steel, GuitarColor.woodGrain);
    }

    public abstract long getPrefix();

    public long getSerialUPC() {return serialUPC;}

    public void setSerialUPC(long serial) {this.serialUPC = serial;}

    @Override
    public GuitarColor getColor() {return color;}

    @Override
    public GuitarStrings getStrings() {return strings;}

    @Override
    public float getPrice() {return 500F;}

    @Override
    public long getUpcCount() {return upc;}

    @Override
    public String getFretBoard() {return fretBoard;}

    public String getAmp() {return amp;}

}


