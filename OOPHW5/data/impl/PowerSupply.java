package OOPHW5.data.impl;

import OOPHW5.data.Parts;

public class PowerSupply extends Parts {
    private int outputPower;

    public PowerSupply(String brand, String model, int outputPower) {
        super(brand, model);
        this.outputPower = outputPower;
    }

    public int getOutputPower() {
        return outputPower;
    }

    public void setOutputPower(int outputPower) {
        this.outputPower = outputPower;
    }

    @Override
    public String toString() {
        return getBrand()+ " " + outputPower + "W " + getModel();
    }
}
