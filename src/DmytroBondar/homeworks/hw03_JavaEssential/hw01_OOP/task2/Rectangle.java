package DmytroBondar.homeworks.hw03_JavaEssential.hw01_OOP.task2;

public class Rectangle {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double areaCalculator(double side1, double side2) {
        return side1 * side2;
    }

    public double perimeterCalculator(double side1, double side2) {
        return (side1 + side2) * 2;
    }
}
