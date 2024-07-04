package DmytroBondar.homeworks.hw03_JavaEssential.hw03_InheritanceAndPolymorphism.task3;

public class Plane extends Vehicle {
    private int height;
    private int passengers;

    public Plane(int x, int y, int price, int speed, int year, int height, int passengers) {
        super(x, y, price, speed, year);
        this.height = height;
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", price=" + getPrice() +
                ", speed=" + getSpeed() +
                ", year=" + getYear() +
                ", height=" + height +
                ", passengers=" + passengers +
                '}';
    }
}
