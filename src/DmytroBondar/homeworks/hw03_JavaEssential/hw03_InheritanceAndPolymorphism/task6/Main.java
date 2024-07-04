package DmytroBondar.homeworks.hw03_JavaEssential.hw03_InheritanceAndPolymorphism.task6;

public class Main {
    public static void main(String[] args) {
        Printer[] printers = new Printer[8];
        printers[0] = new Printer();
        printers[1] = new RedPrinter();
        printers[2] = new GreenPrinter();
        printers[3] = new YellowPrinter();
        printers[4] = new BluePrinter();
        printers[5] = new PurplePrinter();
        printers[6] = new CyanPrinter();
        printers[7] = new WhitePrinter();

        for (Printer printer : printers) {
            printer.print("Hello, World!");
        }
    }
}
