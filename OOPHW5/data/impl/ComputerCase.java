package OOPHW5.data.impl;

import OOPHW5.data.Parts;

public class ComputerCase extends Parts {

    private String standardSize;

    public ComputerCase(String brand, String model, String standardSize) {
        super(brand, model);
        this.standardSize = standardSize;
    }

    public String getStandardSize() {
        return standardSize;
    }

    public void setStandardSize(String standardSize) {
        this.standardSize = standardSize;
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", Типоразмер: " + standardSize;
    }
}
