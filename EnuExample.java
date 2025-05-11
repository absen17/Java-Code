enum Laptop {
    MACBOOK(100), LENOVO(50), ASUS, MSI(80);

    private int price;

    private Laptop() {
        price=70;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}

public class EnuExample {
    public static void main(String[] args) {
        for (Laptop lap : Laptop.values()) {
            System.out.println(lap+ " = " + lap.getPrice());
        }
    }
}
