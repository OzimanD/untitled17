package AnnaP.July14Claa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Civic", "Cedan", LocalDate.of(2000, 11, 20));
        Car car2 = new Car("BMW", "Corola", "Cedan", LocalDate.of(2020, 11, 20));
        Car car3 = new Car("Toyota", "Civic", "Cedan", LocalDate.of(2012, 11, 20));
        Car car4 = new Car("Fiat", "Punto", "Cedan", LocalDate.of(2023, 11, 20));
        Car car5 = new Car("Citroen", "C1", "Cedan", LocalDate.of(2001, 11, 20));
        Car car6 = new Car("Tavria", "Tavria", "Cedan", LocalDate.of(2021, 11, 20));
        Car car7 = new Car("Toyota", "Civic", "Cedan", LocalDate.of(1990, 11, 20));
        Car car8 = new Car("Toyota", "Civic", "Cedan", LocalDate.of(2006, 11, 20));

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        Main main = new Main();
        main.toyotaBefore2007(cars);

    }

    List<Car> toyotaBefore2007(List<Car> cars) {
        List<Car> toyotaBefore2007 = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getManufacturer().equalsIgnoreCase("toyota") && cars.get(i).getBuildYear().isBefore(LocalDate.of(2007, 01, 01))) {
                toyotaBefore2007.add(cars.get(i));
            }
        }
        System.out.println(toyotaBefore2007);
        return toyotaBefore2007;
    }
}


//    Марка автомобиля
//    Производитель
//            Тип
//    Год выпуска
//    Дата регистрации
//
//    Вывести сведения о машинах марки
//        “Toyota” и зарегистрированных до 2007-го
//        года.
//