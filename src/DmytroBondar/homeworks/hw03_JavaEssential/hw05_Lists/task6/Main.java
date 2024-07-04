package DmytroBondar.homeworks.hw03_JavaEssential.hw05_Lists.task6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> teachers = new ArrayList<>();
        teachers.add("Ukrainian language teacher");
        teachers.add("Math teacher");
        teachers.add("English language teacher");
        teachers.add("Physics teacher");
        teachers.add("Chemistry teacher");
        teachers.add("Biology teacher");
        teachers.add("History teacher");
        teachers.add("Geography teacher");
        teachers.add("Physical education teacher");
        teachers.add("Music teacher");
        teachers.add("Art teacher");
        teachers.add("Informatics teacher");

        System.out.println("Index of the best teacher: " + teachers.indexOf("Math teacher"));
        System.out.println("Index of the worst teacher: " + teachers.indexOf("Art teacher"));
    }
}
