import java.util.Scanner;

abstract class Product {
    protected String[] productName;
    protected double[] price;

    public Product(int size) {
        productName = new String[size];
        price = new double[size];
    }

    public void setProductName(String productName, int i) {
        this.productName[i] = productName;
    }

    public void setPrice(double price, int i) {
        this.price[i] = price;
    }

    public String getProductName(int i) {
        return productName[i];
    }

    public double getPrice(int i) {
        return price[i];
    }

    public abstract double finalPrice(int quantity, int i);
}

class Electronics extends Product {
    protected String[] warrantyInformation;
    protected double[] discount;

    public Electronics(int size) {
        super(size);
        warrantyInformation = new String[size];
        discount = new double[size];
    }

    public void setWarrantyInformation(String warrantyInformation, int i) {
        this.warrantyInformation[i] = warrantyInformation;
    }

    public void setDiscount(int i) {
        if (price[i] > 5000) {
            discount[i] = 500;
        } else if (price[i] > 1000) {
            discount[i] = 100;
        } else {
            discount[i] = 0;
        }
    }

    public void display(int i) {
        System.out.println("\nProduct Name: " + productName[i]);
        System.out.println("Price: " + price[i]);
        System.out.println("Warranty: " + warrantyInformation[i]);
        System.out.println("Discount: " + discount[i]);
    }

    @Override
    public double finalPrice(int quantity, int i) {
        return (price[i] * quantity) - discount[i];
    }
}

class Clothing extends Product {
    private String[] size;
    private String[] type;
    private double[] discount;

    public Clothing(int n) {
        super(n);
        size = new String[n];
        type = new String[n];
        discount = new double[n];
    }

    public void setSize(String size, int i) {
        this.size[i] = size;
    }

    public void setType(String type, int i) {
        this.type[i] = type;
    }

    public void setDiscount(int i) {
        if (type[i].equalsIgnoreCase("Shirt")) {
            discount[i] = 1000;
        } else if (type[i].equalsIgnoreCase("Pants")) {
            discount[i] = 500;
        } else if (type[i].equalsIgnoreCase("Shoes")) {
            discount[i] = 2000;
        } else {
            discount[i] = 100;
        }
    }

    public void display(int i) {
        System.out.println("\nProduct Name: " + productName[i]);
        System.out.println("Price: " + price[i]);
        System.out.println("Size: " + size[i]);
        System.out.println("Type: " + type[i]);
        System.out.println("Discount: " + discount[i]);
    }

    @Override
    public double finalPrice(int quantity, int i) {
        if (quantity > 3) {
            return (price[i] * quantity) - discount[i];
        }
        return price[i] * quantity;
    }
}

public class E_Commerce_Order_System {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("How many Electronics products? ");
        int choice = s.nextInt();
        s.nextLine();

        Electronics e = new Electronics(choice);

        for (int i = 0; i < choice; i++) {
            System.out.print((i+1) + "- Product Name: ");
            e.setProductName(s.nextLine(), i);

            System.out.print("Price: ");
            e.setPrice(s.nextDouble(), i);
            s.nextLine();

            System.out.print("Warranty: ");
            e.setWarrantyInformation(s.nextLine(), i);

            e.setDiscount(i);

            e.display(i);

            System.out.print("Quantity: ");
            int qty = s.nextInt();
            s.nextLine();

            System.out.println("Final Price = " + e.finalPrice(qty, i));
        }

        System.out.print("\nHow many Clothing products? ");
        int cChoice = s.nextInt();
        s.nextLine();

        Clothing c = new Clothing(cChoice);

        for (int i = 0; i < cChoice; i++) {
            System.out.print((i+1) + "- Product Name: ");
            c.setProductName(s.nextLine(), i);

            System.out.print("Price: ");
            c.setPrice(s.nextDouble(), i);
            s.nextLine();

            System.out.print("Size: ");
            c.setSize(s.nextLine(), i);

            System.out.print("Type: ");
            c.setType(s.nextLine(), i);

            c.setDiscount(i);

            c.display(i);

            System.out.print("Quantity: ");
            int qty = s.nextInt();
            s.nextLine();

            System.out.println("Final Price = " + c.finalPrice(qty, i));
        }
        s.close();
    }
}