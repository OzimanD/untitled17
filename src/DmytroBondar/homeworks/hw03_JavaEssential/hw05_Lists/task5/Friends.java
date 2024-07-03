package DmytroBondar.homeworks.hw03_JavaEssential.hw05_Lists.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Friends {
    public static void main(String[] args) {
        List<String> friends = new ArrayList<>();
        friends.add("John");
        friends.add("Jack");
        friends.add("Jim");
        friends.add("Alex");
        friends.add("Tom");
        friends.add("Bob");
        friends.add("Bill");
        friends.add("Nick");
        friends.add("Rick");

        String[] friendsArray = new String[friends.size()];
        friendsArray = friends.toArray(friendsArray);

        System.out.println(friends);

        Arrays.sort(friendsArray);

        System.out.println(Arrays.toString(friendsArray));
    }
}
