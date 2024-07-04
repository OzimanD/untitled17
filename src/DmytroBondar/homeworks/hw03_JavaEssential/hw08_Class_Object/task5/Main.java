package DmytroBondar.homeworks.hw03_JavaEssential.hw08_Class_Object.task5;

public class Main {
    public static void main(String[] args) {
        Animal murzik1 = new Animal("Murzik", 3, true);
        Animal murzik2 = new Animal("Murzik", 3, true);

        System.out.println(murzik1);
        System.out.println(murzik2.hashCode());
        System.out.println(murzik1);
        System.out.println(murzik2.hashCode());

        System.out.println(murzik1.equals(murzik2));
    }
}
