package DmytroBondar.homeworks.hw03_JavaEssential.hw07_Exceptions.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("Enter operation (+, -, *, /):");
        char operation = scanner.next().charAt(0);
        double result = 0;
        switch (operation) {
            case '+':
                result = Calculator.add(a, b);
                break;
            case '-':
                result = Calculator.sub(a, b);
                break;
            case '*':
                result = Calculator.mul(a, b);
                break;
            case '/':
                try {
                    result = Calculator.div(a, b);
                } catch (ArithmeticException e) {
                    System.err.println("Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
        System.out.println("Result: " + result);
    }
}
