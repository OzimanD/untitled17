package DmytroBondar.homeworks.hw03_JavaEssential.hw04_Abstraction.task5;

public class ConverterTemperature {
    public static void convert(double celsius) {
        System.out.println("Celsius: " + celsius);
        System.out.println("Kelvin: " + (celsius + 273.15));
        System.out.println("Fahrenheit: " + (celsius * 9 / 5 + 32));
    }
}
