package AnnaP.July9;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Train {
    private int trainNumber;
    private String placeArriving;
    private String placeDeparting;
    private LocalTime timeArriving;
    private LocalTime timeDeparting;

    public Train(int trainNumber, String placeArriving, String placeDeparting, LocalTime timeArriving, LocalTime timeDeparting) {
        this.trainNumber = trainNumber;
        this.placeArriving = placeArriving;
        this.placeDeparting = placeDeparting;
        this.timeArriving = timeArriving;
        this.timeDeparting = timeDeparting;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getPlaceArriving() {
        return placeArriving;
    }

    public void setPlaceArriving(String placeArriving) {
        this.placeArriving = placeArriving;
    }

    public String getPlaceDeparting() {
        return placeDeparting;
    }

    public void setPlaceDeparting(String placeDeparting) {
        this.placeDeparting = placeDeparting;
    }

    public LocalTime getTimeArriving() {
        return timeArriving;
    }

    public void setTimeArriving(LocalTime timeArriving) {
        this.timeArriving = timeArriving;
    }

    public LocalTime getTimeDeparting() {
        return timeDeparting;
    }

    public void setTimeDeparting(LocalTime timeDeparting) {
        this.timeDeparting = timeDeparting;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainNumber=" + trainNumber +
                ", placeArriving='" + placeArriving + '\'' +
                ", placeDeparting='" + placeDeparting + '\'' +
                ", timeArriving=" + timeArriving +
                ", timeDeparting=" + timeDeparting +
                '}';
    }
}


//    No поезда
//    Пункт и время прибытия
//    Пункт и время отбытия
//
//    Вывести все сведения о поездах, время
//        пребывания в пути которых превышает 7
//        часов 20 минут.