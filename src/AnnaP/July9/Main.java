package AnnaP.July9;

import java.time.LocalTime;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Train train1 = new Train(12, "Berlin", "Hannover", LocalTime.of(12, 30), LocalTime.of(15, 30));
        Train train2 = new Train(13, "Kyiv", "Hannover", LocalTime.of(12, 30), LocalTime.of(22, 30));
        Train train3 = new Train(14, "Milano", "Paris", LocalTime.of(11, 00), LocalTime.of(16, 20));
        Train train4 = new Train(15, "Berlin", "Leipzig", LocalTime.of(20, 30), LocalTime.of(22, 00));
        Train train5 = new Train(12, "Hannover", "Berlin", LocalTime.of(16, 30), LocalTime.of(19, 30));
        Train train6 = new Train(12, "Celle", "Dresden", LocalTime.of(7, 30), LocalTime.of(10, 00));

        List<Train> trains = new ArrayList<>();
        trains.add(train1);
        trains.add(train2);
        trains.add(train3);
        trains.add(train4);
        trains.add(train5);
        trains.add(train6);

        System.out.println(train1.getTimeDeparting().getMinute());
    }

    public List<Train> routLength(List<Train> trains, int hours, int minutes) {

        for (int i = 0; i < trains.size(); i++) {
            LocalTime routLength = LocalTime.of(hours, minutes);
            int arriving = trains.get(i).getTimeArriving().getHour() * 60;
            LocalTime departing = trains.get(i).getTimeDeparting();
            if () {

            }

        }
    }
}


//    No поезда
//    Пункт и время прибытия
//    Пункт и время отбытия
//
//    Вывести все сведения о поездах, время
//        пребывания в пути которых превышает 7
//        часов 20 минут.
// 2 methods - Home work
