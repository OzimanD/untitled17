package DmytroBondar.lessons.oop.trains;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static LocalTime TRAVEL_TIME = LocalTime.of(7, 20);
    public static void main(String[] args) {
        List<Train> trains = new ArrayList<>();
        trains.add(new Train( 1, "Kyiv", LocalTime.of( 0, 0), "Lviv", LocalTime.of( 7, 20)));
        trains.add(new Train( 2, "Dnipro", LocalTime.of( 7, 0), "Lviv", LocalTime.of( 20, 0)));
        trains.add(new Train( 3, "Vinnytsia", LocalTime.of( 22, 0), "Lviv", LocalTime.of( 5, 30)));

        Main main = new Main();
        main.printList(main.getTrainsWhenTravelTimeIsLongerThan(trains, TRAVEL_TIME));
    }

    public List<Train> getTrainsWhenTravelTimeIsLongerThan(List<Train> trains, LocalTime travelTime) {
        List<Train> resultTrains = new ArrayList<>();
        for (Train train : trains) {
            LocalTime durationTime = train.getArrivalTime().minusHours(train.getDepartureTime().getHour())
                                                           .minusMinutes(train.getDepartureTime().getMinute());
            if (durationTime.isAfter(travelTime)) {
                resultTrains.add(train);
            }
        }
        return resultTrains;
    }

    public <T> void printList(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }
}
