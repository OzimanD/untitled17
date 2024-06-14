package AnnaP.LessonArrayList;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Date;

public class Goods {
    private String name;
    private String producer;
    private int amount;
    private double price;
    private LocalDate date;

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", date=" + date +
                '}';
    }

    public Goods(String name, String producer, int amount, double price, LocalDate date) {
        this.name = name;
        this.producer = producer;
        this.amount = amount;
        this.price = price;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }




}





//     Наименование
//        Изготовитель
//       Год_выпуска
//            Количество
//         Цена