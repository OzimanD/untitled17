package DmytroBondar.homeworks.hw03_JavaEssential.hw03_InheritanceAndPolymorphism.task3;

public class Ship extends Vehicle {
    private int passengers;
    private String port;

    public Ship(int x, int y, int price, int speed, int year, int passengers, String port) {
        super(x, y, price, speed, year);
        this.passengers = passengers;
        this.port = port;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", price=" + getPrice() +
                ", speed=" + getSpeed() +
                ", year=" + getYear() +
                ", passengers=" + passengers +
                ", port='" + port + '\'' +
                '}';
    }
}
