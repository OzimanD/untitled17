package DmytroBondar.homeworks.hw03_JavaEssential.hw06_Static_and_Nested_Classes_Anonymous_classes_and_Enums.task2;

public enum Animals {
    CAT(2),
    DOG(3),
    FISH(1),
    BIRD(1),
    RABBIT(2),
    TURTLE(5),
    HAMSTER(1);

    private int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "age=" + age +
                '}';
    }
}
