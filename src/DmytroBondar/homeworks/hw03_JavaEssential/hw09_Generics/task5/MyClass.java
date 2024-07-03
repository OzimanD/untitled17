package DmytroBondar.homeworks.hw03_JavaEssential.hw09_Generics.task5;

public class MyClass {
    public static <T> T factoryMethod(Class<T> clazz) {
        try {
            return clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
