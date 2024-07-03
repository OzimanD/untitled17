package DmytroBondar.homeworks.hw03_JavaEssential.hw02_ClassesAndObjects.task4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2002);
        Car car3 = new Car(2020, 200);
        Car car4 = new Car(2022, 300, 2000);
        Car car5 = new Car(2024, 333, 2000, "black");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
