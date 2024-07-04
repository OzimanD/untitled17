package DmytroBondar.homeworks.hw03_JavaEssential.hw07_Exceptions.task3;

public class Price {
    private String productName;
    private String storeName;
    private double price;

    public Price(String productName, String storeName, double price) {
        this.productName = productName;
        this.storeName = storeName;
        this.price = price;
    }

    public String getStoreName() {
        return storeName;
    }

    @Override
    public String toString() {
        return "Price{" +
                "productName='" + productName + '\'' +
                ", storeName='" + storeName + '\'' +
                ", price=" + price +
                '}';
    }
}
