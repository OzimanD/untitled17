package DmytroBondar.homeworks.hw03_JavaEssential.hw01_OOP.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the first side of the rectangle:");
        double side1 = scanner.nextDouble();
        System.out.println("Enter the length of the second side of the rectangle:");
        double side2 = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(side1, side2);
        System.out.println("Area is: " + rectangle.areaCalculator(side1, side2));
        System.out.println("Perimeter is: " + rectangle.perimeterCalculator(side1, side2));
    }
}
