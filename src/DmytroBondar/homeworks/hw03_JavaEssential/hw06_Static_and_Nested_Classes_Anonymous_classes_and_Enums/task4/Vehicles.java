package DmytroBondar.homeworks.hw03_JavaEssential.hw06_Static_and_Nested_Classes_Anonymous_classes_and_Enums.task4;

public enum Vehicles {
    CAR(10000, "black"),
    BUS(20000, "yellow"),
    TRUCK(30000, "white"),
    MOTORCYCLE(5000, "red"),
    BICYCLE(100, "green");

    private int price;
    private String color;

    Vehicles(int price) {
        this.price = price;
    }

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
