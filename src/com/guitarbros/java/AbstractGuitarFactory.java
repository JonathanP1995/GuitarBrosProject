package com.guitarbros.java;

public abstract class AbstractGuitarFactory implements AcousticInterface {
    protected long upc;
    private long serialUPC;

    public abstract long getPrefix();

    public long getSerialUPC() {return serialUPC;}

    public void setSerialUPC(long serial) { this.serialUPC = serial;}

    @Override
    public long getUpcCount() { return upc; }


    public abstract void createFrame(AcousticInterface acoustic);
    public abstract void createFrame(ElectricInterface electric);
    public abstract void createFrame(HybridInterface hybrid);

}
