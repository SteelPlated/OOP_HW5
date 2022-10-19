package OOPHW5.data.impl;

import OOPHW5.data.Parts;

public class MotherBoard extends Parts {
    private int numberOfMemorySlots;

    public MotherBoard(String brand, String model, int numberOfMemorySlots) {
        super(brand, model);
        this.numberOfMemorySlots = numberOfMemorySlots;
    }

    public int getNumberOfMemorySlots() {
        return numberOfMemorySlots;
    }

    public void setNumberOfMemorySlots(int numberOfMemorySlots) {
        this.numberOfMemorySlots = numberOfMemorySlots;
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() +
                " Количество слотов памяти: " + numberOfMemorySlots;
    }
}
