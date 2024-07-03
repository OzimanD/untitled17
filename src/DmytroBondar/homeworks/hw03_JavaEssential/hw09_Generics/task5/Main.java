package DmytroBondar.homeworks.hw03_JavaEssential.hw09_Generics.task5;

public class Main {
    public static void main(String[] args) {
        SomeClass someClass = MyClass.factoryMethod(SomeClass.class);
        System.out.println(someClass);
    }
}

class SomeClass {
    @Override
    public String toString() {
        return "SomeClass";
    }
}