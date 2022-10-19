package OOPHW5.builder;

import OOPHW5.data.Computer;

public class ComputerBuilder {
    private String motherBoard;
    private String cpu;
    private String raw;
    private String ssd;
    private String powerSupply;
    private String computerCase;
    private String graphicsCard;

    public Computer computerBuilder(){
        return new Computer(motherBoard, cpu, raw, ssd, graphicsCard, powerSupply, computerCase);
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public void setComputerCase(String computerCase) {
        this.computerCase = computerCase;
    }
}
