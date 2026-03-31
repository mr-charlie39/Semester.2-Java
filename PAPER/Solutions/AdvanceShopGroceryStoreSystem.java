import java.time.LocalDate;
import java.util.Scanner;

abstract class Product {
    protected String[] name;
    protected double[] price;
    protected int[] quantity;
    protected double[] totalPrice;

    public Product(int size) {
        name = new String[size];
        price = new double[size];
        quantity = new int[size];
        totalPrice = new double[size];
    }

    public void setName(String name, int i) {
        this.name[i] = name;
    }

    public String getName(int i) {
        return name[i];
    }

    public void setPrice(double price, int i) {
        this.price[i] = price;
    }

    public double getPrice(int i) {
        return price[i];
    }

    public void setQuantity(int quantity, int i) {
        this.quantity[i] = quantity;
    }

    public int getQuantity(int i) {
        return quantity[i];
    }

    public void setTotalPrice(double totalPrice, int i) {
        this.totalPrice[i] = totalPrice;
    }

    public double getTotalPrice(int i) {
        return totalPrice[i];
    }

    abstract double calculateTotalPrice();

    abstract int totalQuantity();
}

class InitializeProduct extends Product {

    int product;

    public InitializeProduct(int size) {
        super(size);
        this.product = size;
    }

    public void initialize() {
        Scanner s = new Scanner(System.in);

        String q1 = "Enter product name:";
        for (int i = 0; i < product; i++) {
            for (int j = 0; j < q1.length(); j++) {
                System.out.print(q1.charAt(j));
                try {
                    Thread.sleep(70);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            String productName = s.nextLine();
            setName(productName, i);

            System.out.print("Enter price: ");
            double p = s.nextDouble();
            setPrice(p, i);

            System.out.print("Enter quantity: ");
            int q = s.nextInt();
            setQuantity(q, i);

            s.nextLine();

            double total = price[i] * quantity[i];
            setTotalPrice(total, i);

            System.out.println("Total price of product: " + total);
        }

        System.out.println("\nOverall Total Price: " + calculateTotalPrice());
        System.out.println("Total Quantity: " + totalQuantity());

    }

    @Override
    public double calculateTotalPrice() {
        double total = 0;
        for (int i = 0; i < product; i++) {
            total += totalPrice[i];
        }
        return total;
    }

    @Override
    public int totalQuantity() {
        int total = 0;
        for (int i = 0; i < product; i++) {
            total += quantity[i];
        }
        return total;
    }
}

class detail {
    static Scanner s = new Scanner(System.in);

    public void menufature() {
        System.out.print("Enter Year of Manufacture: ");
        int year = s.nextInt();
        
        System.out.print("Enter Month of Manufacture: ");
        int month = s.nextInt();
        
        System.out.print("Enter Day of Manufacture: ");
        int day = s.nextInt();

        LocalDate manufactureDate = LocalDate.of(year, month, day);
        System.out.println("Manufacture Date: " + manufactureDate);

        LocalDate currentDate = LocalDate.now();

        if(currentDate.isAfter(manufactureDate)) {
            System.out.println("Product is expired.");
        } else {
            System.out.println("Product is not expired.");
        }
    }

    public void warranty(){
        System.out.print("Enter Year of Warranty: ");
        int year = s.nextInt();
        
        System.out.print("Enter Month of Warranty: ");
        int month = s.nextInt();
        
        System.out.print("Enter Day of Warranty: ");
        int day = s.nextInt();

        LocalDate warrantyDate = LocalDate.of(year, month, day);
        System.out.println("Warranty Date: " + warrantyDate);

        LocalDate currentDate = LocalDate.now();

        if(currentDate.isAfter(warrantyDate)) {
            System.out.println("Warranty is expired.");
        } else {
            System.out.println("Warranty is not expired.");
        }
    }
}

public class AdvanceShopGroceryStoreSystem {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = s.nextInt();
        s.nextLine();

        InitializeProduct obj = new InitializeProduct(n);
        obj.initialize();

        detail d = new detail();

        d.menufature();
        d.warranty();

        s.close();
    }
}