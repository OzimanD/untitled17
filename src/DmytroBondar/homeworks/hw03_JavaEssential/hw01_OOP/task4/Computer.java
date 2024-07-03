package DmytroBondar.homeworks.hw03_JavaEssential.hw01_OOP.task4;

public class Computer {
    private String manufacturer;
    private int serialNumber;
    private double price;
    private int quantityCPU;
    private double frequencyCPU;

    public Computer(String manufacturer, int serialNumber, double price, int quantityCPU, double frequencyCPU) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
        this.quantityCPU = quantityCPU;
        this.frequencyCPU = frequencyCPU;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "manufacturer='" + manufacturer + '\'' +
                ", serialNumber=" + serialNumber +
                ", price=" + price +
                ", quantityCPU=" + quantityCPU +
                ", frequencyCPU=" + frequencyCPU +
                '}';
    }
}
