package AnnaP.July14Claa;

import java.util.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Civic", "Cedan", new Date(2000));
        Car car2 = new Car("BMW", "Corola", "Cedan", new Date(2000));
        Car car3 = new Car("Toyota", "Civic", "Cedan",new Date(2020));
        Car car4 = new Car("Fiat", "Punto", "Cedan", new Date(2000));
        Car car5 = new Car("Citroen", "C1", "Cedan", new Date(2000));
        Car car6 = new Car("Tavria", "Tavria", "Cedan", new LocalDate(2023,11,20));

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        Main main = new Main();
        main.toyotaBefore2007(cars);

    }

    List<Car> toyotaBefore2007(List<Car> cars){
        List<Car> toyotaBefore2007 = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
//            System.out.println(cars.get(i).getBuildYear());
//            System.out.println(new Date(2007,01,01));
            if (cars.get(i).getManufacturer().equalsIgnoreCase("toyota") && cars.get(i).getBuildYear().before(new Date(2007))) {
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