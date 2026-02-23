public class Program_12 {

    public static void main(String[] args) {

        Car c = new Car("BMW", 100000, 200);

        System.out.println("Name : " + c.getName());
        System.out.println("Price : " + c.getPrice());
        System.out.println("Top-Speed : " + c.getTopSpeed());
    }
}

class Car {
    String name;
    double price;
    int topSpeed;

    public Car(String name, double price, int topSpeed) {
        this.name = name;
        this.price = price;
        this.topSpeed = topSpeed;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getTopSpeed() {
        return topSpeed;
    }
}
