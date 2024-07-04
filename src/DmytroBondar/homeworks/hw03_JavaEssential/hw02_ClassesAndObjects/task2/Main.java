package DmytroBondar.homeworks.hw03_JavaEssential.hw02_ClassesAndObjects.task2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2020);
        Car car3 = new Car(2022, "black");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
