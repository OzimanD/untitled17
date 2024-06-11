package AnnaP;

import java.util.Scanner;

public class Rectangle {
      double side1;
      double side2;

    public static double areaCalculator (double side1, double side2){
        double square = side1*side2;
        return square;
    }
    public static double perimeterCalculator(double side1, double side2){
        double perimeter = (side1+side2)*2;
        return perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the FIRST side of the rectangular");
        double side1 = scanner.nextDouble();
        System.out.println("Enter the size of SECOND sides of the rectangular");
        double side2 = scanner.nextDouble();

        System.out.println("Perimeter is: " + perimeterCalculator(side1, side2));
        System.out.println("Area is: " + areaCalculator(side1, side2));
    }
}
