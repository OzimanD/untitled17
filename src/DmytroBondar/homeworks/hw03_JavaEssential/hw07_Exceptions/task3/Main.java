package DmytroBondar.homeworks.hw03_JavaEssential.hw07_Exceptions.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final int PRICE_COUNT = 2;

    public static void main(String[] args) {
        List<Price> prices = new ArrayList<>();

        System.out.println("Enter information about " + PRICE_COUNT + " products:");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < PRICE_COUNT; i++) {
            System.out.println("Enter product name:");
            String productName = scanner.nextLine();
            System.out.println("Enter store name:");
            String storeName = scanner.nextLine();
            System.out.println("Enter price:");
            double price = scanner.nextDouble();
            prices.add(new Price(productName, storeName, price));
            scanner.nextLine();
        }

        System.out.println("Enter store name to get price:");
        String storeName = scanner.next();
        try {
            for (Price price : prices) {
                if (price.getStoreName().equalsIgnoreCase(storeName)) {
                    System.out.println(price);
                    return;
                }
            }
            throw new Exception();
        } catch (Exception e) {
            System.err.println("Store not found");
        }
    }
}
