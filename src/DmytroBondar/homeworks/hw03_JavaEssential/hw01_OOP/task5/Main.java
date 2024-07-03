package DmytroBondar.homeworks.hw03_JavaEssential.hw01_OOP.task5;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        address.setIndex(12345);
        address.setCountry("Ukraine");
        address.setCity("Kyiv");
        address.setStreet("Khreshchatyk");
        address.setHouse("1");
        address.setApartment("1");
        System.out.println(address);
    }
}
