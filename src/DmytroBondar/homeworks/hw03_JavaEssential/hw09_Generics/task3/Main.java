package DmytroBondar.homeworks.hw03_JavaEssential.hw09_Generics.task3;

public class Main {
    public static void main(String[] args) {
        MyDictionary<String, Integer> myDictionary = new MyDictionary<>();
        myDictionary.add("one", 1);
        myDictionary.add("two", 2);
        myDictionary.add("three", 3);

        System.out.println("Size: " + myDictionary.size());

        System.out.println(myDictionary.get("one"));
        System.out.println(myDictionary.get("two"));
        System.out.println(myDictionary.get("three"));
    }
}
