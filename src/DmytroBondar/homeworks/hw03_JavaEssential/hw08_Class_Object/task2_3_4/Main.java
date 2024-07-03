package DmytroBondar.homeworks.hw03_JavaEssential.hw08_Class_Object.task2_3_4;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120, "AB1234567CD");
        Device monitor = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        Device ethernetAdapter = new EthernetAdapter("Samsung", 120, "AB1234567CD", 1000, "00:00:00:00:00:00");

        System.out.println(device);
        System.out.println(device.hashCode());
        System.out.println(monitor);
        System.out.println(monitor.hashCode());
        System.out.println(ethernetAdapter);
        System.out.println(ethernetAdapter.hashCode());

        System.out.println(device.equals(monitor));
        System.out.println(device.equals(ethernetAdapter));
    }
}