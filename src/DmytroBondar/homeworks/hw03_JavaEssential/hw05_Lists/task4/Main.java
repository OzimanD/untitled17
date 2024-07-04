package DmytroBondar.homeworks.hw03_JavaEssential.hw05_Lists.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        ListIterator<Integer> listIterator = integerList.listIterator();
        while (listIterator.hasNext()) {
            Integer integer = listIterator.next();
            integerList.set(listIterator.nextIndex() - 1, integer + 1);
        }

        System.out.println(integerList);
    }
}
