package DmytroBondar.lessons.oop.trains;

import java.time.LocalTime;

public class Train {
    private int trainNumber;
    private String departingPlace;
    private LocalTime departureTime;
    private String arrivalPlace;
    private LocalTime arrivalTime;

    public Train(int trainNumber, String departingPlace, LocalTime departureTime, String arrivalPlace, LocalTime arrivalTime) {
        this.trainNumber = trainNumber;
        this.departingPlace = departingPlace;
        this.departureTime = departureTime;
        this.arrivalPlace = arrivalPlace;
        this.arrivalTime = arrivalTime;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getDepartingPlace() {
        return departingPlace;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public String getArrivalPlace() {
        return arrivalPlace;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainNumber=" + trainNumber +
                ", departingPlace='" + departingPlace + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalPlace='" + arrivalPlace + '\'' +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}
