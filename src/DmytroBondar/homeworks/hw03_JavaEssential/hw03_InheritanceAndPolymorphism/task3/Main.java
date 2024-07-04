package DmytroBondar.homeworks.hw03_JavaEssential.hw03_InheritanceAndPolymorphism.task3;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Ship(1, 2, 1000, 100, 2000, 100, "Odesa");
        vehicles[1] = new Plane(3, 4, 2000, 200, 2001, 1000, 200);
        vehicles[2] = new Car(5, 6, 3000, 300, 2002);

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
