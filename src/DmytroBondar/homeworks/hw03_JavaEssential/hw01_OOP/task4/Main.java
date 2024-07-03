package DmytroBondar.homeworks.hw03_JavaEssential.hw01_OOP.task4;

public class Main {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];

        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer("Apple", 1000 + i, 1000.00 + i * 100, 4 , 2 + i * 0.1);
        }

        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }
}
