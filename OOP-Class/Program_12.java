public class Program_12 {

    void display(){
        System.out.println("Name : " + c.getName());
        System.out.println("Price : " + c.getPrice());
        System.out.println("Top-Speed : " + c.getTopSpeed());
    }

    public static void main(String[] args) {

        Car c = new Car("BMW", 100000, 200);

        c.display();
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
