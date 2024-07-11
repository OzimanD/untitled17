package AnnaP.July9;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Train train1 = new Train(12, "Berlin", "Hannover", LocalTime.of(23, 00), LocalTime.of(02, 00));
        Train train2 = new Train(13, "Kyiv", "Hannover", LocalTime.of(12, 15), LocalTime.of(22, 35));
        Train train3 = new Train(14, "Milano", "Paris", LocalTime.of(19, 30), LocalTime.of(01, 30));
        Train train4 = new Train(15, "Berlin", "Leipzig", LocalTime.of(21, 30), LocalTime.of(22, 00));
        Train train5 = new Train(12, "Hannover", "Berlin", LocalTime.of(16, 40), LocalTime.of(19, 30));
        Train train6 = new Train(12, "Celle", "Dresden", LocalTime.of(7, 30), LocalTime.of(8, 25));

        List<Train> trains = new ArrayList<>();
        trains.add(train1);
        trains.add(train2);
        trains.add(train3);
        trains.add(train4);
        trains.add(train5);
        trains.add(train6);

        Main main = new Main();
        System.out.println(main.routLength(trains, 1, 30));
        System.out.println(main.longDurationTrains(trains, 3, 30));
    }

    public List<Train> routLength(List<Train> trains, int hours, int minutes) {
        List<Train> longTrains = new ArrayList<>();
        for (int i = 0; i < trains.size(); i++) {
            int arrivingH = trains.get(i).getTimeArriving().getHour() * 60;
            int arrivingM = trains.get(i).getTimeArriving().getMinute();
            int arriving = arrivingM + arrivingH;
            int departingH = trains.get(i).getTimeDeparting().getHour() * 60;
            int departingM = trains.get(i).getTimeDeparting().getMinute();
            int diffH = 0;
            int diffM = 0;
            int departing = departingH + departingM;
            if (departingH > arrivingH) {
                diffH = (1440 - departing + arriving) / 60;
                diffM = (1440 - departing + arriving) % 60;
                System.out.println("It's a night train ");
            } else {
                diffH = (arriving - departing) / 60;
                diffM = (arriving - departing) % 60;
            }

            if (diffH > hours) {
                longTrains.add(trains.get(i));
                System.out.println("The trip last " + diffH + ":" + diffM + "h from " + trains.get(i).getPlaceDeparting() + " to " + trains.get(i).getPlaceArriving());
            } else if (diffM > minutes && diffH == hours) {
                longTrains.add(trains.get(i));
                System.out.println("The trip last " + diffH + ":" + diffM + "h from " + trains.get(i).getPlaceDeparting() + " to " + trains.get(i).getPlaceArriving());
            } else {
                System.out.println("The trip last " + diffH + ":" + diffM + "h from " + trains.get(i).getPlaceDeparting() + " to " + trains.get(i).getPlaceArriving() + " and this is not long trip");
            }
        }
        return longTrains;
    }

    public List<Train> longDurationTrains(List<Train> trains, int hours, int minutes) {
        List<Train> longTrains = new ArrayList<>();

        for (int i = 0; i < trains.size(); i++) {
            long tripTimeMilliseconds;
            if (trains.get(i).getTimeDeparting().isAfter(trains.get(i).getTimeArriving())) {
                tripTimeMilliseconds = 86400000 - Time.valueOf(trains.get(i).getTimeDeparting()).getTime() + Time.valueOf(trains.get(i).getTimeArriving()).getTime();
                System.out.println("it is a night train ");
            } else {
                tripTimeMilliseconds = Time.valueOf(trains.get(i).getTimeArriving()).getTime() - Time.valueOf(trains.get(i).getTimeDeparting()).getTime();
            }
            double tripTotalMinutes = tripTimeMilliseconds / 60000;
            int tripH = (int) tripTotalMinutes / 60;
            int tripM = (int) tripTotalMinutes % 60;

            if (tripH > hours) {
                longTrains.add(trains.get(i));
                System.out.println("duration: " + tripH + ":" + tripM + " from " + trains.get(i).getPlaceDeparting());
            } else if (tripH == hours && tripM > minutes) {
                longTrains.add(trains.get(i));
                System.out.println("duration: " + tripH + ":" + tripM + " from " + trains.get(i).getPlaceDeparting());
            } else if (tripH < hours) {
                System.out.println("duration: " + tripH + ":" + tripM + " from " + trains.get(i).getPlaceDeparting() + " it is a short train ");
            }
        }
        return longTrains;
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
