package AnnaP.July14Claa;

import java.time.LocalDate;
import java.util.Date;

public class Car {
    private String Manufacturer;
    private String Mark;
    private String Type;
    private Date buildYear;

    public Car(String manufacturer, String mark, String type, Date buildYear) {
        Manufacturer = manufacturer;
        Mark = mark;
        Type = type;
        this.buildYear = buildYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Manufacturer='" + Manufacturer + '\'' +
                ", Mark='" + Mark + '\'' +
                ", Type='" + Type + '\'' +
                ", buildYear=" + buildYear +
                '}';
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getMark() {
        return Mark;
    }

    public void setMark(String mark) {
        Mark = mark;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Date getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(Date buildYear) {
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