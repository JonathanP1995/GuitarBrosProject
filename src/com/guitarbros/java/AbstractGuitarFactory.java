package com.guitarbros.java;

public abstract class AbstractGuitarFactory implements AbstractAcoustic {
    protected long upc;
    private long serialUPC;

    public abstract long getPrefix();

    public long getSerialUPC() {return serialUPC;}

    public void setSerialUPC(long serial) { this.serialUPC = serial;}

    @Override
    public long getUpcCount() { return upc; }


    public abstract void createFrame(AbstractAcoustic acoustic);
    public abstract void createFrame(AbstractElectric electric);
    public abstract void createFrame(AbstractHybrid hybrid);

}
