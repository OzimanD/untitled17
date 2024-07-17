package AnnaP.July14Claa;

import java.time.LocalDate;
import java.util.Date;

public class Car {
    private String manufacturer;
    private String mark;
    private String type;
    private LocalDate buildYear;

    public Car(String manufacturer, String mark, String type, LocalDate buildYear) {
        this.manufacturer = manufacturer;
        this.mark = mark;
        this.type = type;
        this.buildYear = buildYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", mark='" + mark + '\'' +
                ", type='" + type + '\'' +
                ", buildYear=" + buildYear +
                '}';
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(LocalDate buildYear) {
        this.buildYear = buildYear;
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