package OOPHW5.data.impl;

import OOPHW5.data.Parts;

public class Ssd extends Parts {
    private int ssdCapacity;

    public Ssd(String brand, String model, int ssdCapacity) {
        super(brand, model);
        this.ssdCapacity = ssdCapacity;
    }

    public int getSsdCapacity() {
        return ssdCapacity;
    }

    public void setSsdCapacity(int ssdCapacity) {
        this.ssdCapacity = ssdCapacity;
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + " " + ssdCapacity + " Gb.";
    }
}
