package DmytroBondar.homeworks.hw03_JavaEssential.hw03_InheritanceAndPolymorphism.task6;

public class GreenPrinter extends Printer {
    @Override
    public void print(String value) {
        System.out.println("\u001B[32m" + value + "\u001B[0m");
    }
}
