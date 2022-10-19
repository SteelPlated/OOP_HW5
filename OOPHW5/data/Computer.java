package OOPHW5.data;

public class Computer {

    private final String motherBoard;
    private final String cpu;
    private final String raw;
    private final String ssd;
    private final String graphicsCard;
    private final String powerSupply;
    private final String computerCase;

    public Computer(String motherBoard, String cpu, String raw, String ssd, String graphicsCard,
                    String powerSupply, String computerCase) {
        this.motherBoard = motherBoard;
        this.cpu = cpu;
        this.raw = raw;
        this.ssd = ssd;
        this.graphicsCard = graphicsCard;
        this.powerSupply = powerSupply;
        this.computerCase = computerCase;

    }

    @Override
    public String toString() {
        return "Компьютер:\n" +
                "Корпус " + computerCase +
                "Процессор " + cpu + "\n" +
                "Материнская плата " + motherBoard + "\n" +
                "SSD накопитель " + ssd + "\n" +
                "Оперативная память " + raw + "\n" +
                "Видеокарта " + graphicsCard + "\n" +
                "Блок питания " + powerSupply + "\n";
                
    }
}
