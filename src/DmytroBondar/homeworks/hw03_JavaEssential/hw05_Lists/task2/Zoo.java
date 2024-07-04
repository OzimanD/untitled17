package DmytroBondar.homeworks.hw03_JavaEssential.hw05_Lists.task2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add(0, "Lion");
        animals.add(1, "Tiger");
        animals.add(2, "Bear");
        animals.add(3, "Wolf");
        animals.add(4, "Fox");
        animals.add(5, "Elephant");
        animals.add(6, "Giraffe");
        animals.add(7, "Zebra");

        System.out.println(animals);
    }
}
