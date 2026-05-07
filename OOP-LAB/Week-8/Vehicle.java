public class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        System.out.println("Default Vehicle Details:");
        vehicle1.displayDetails();

        Vehicle vehicle2 = new Vehicle("Toyota", "Camry", 2020);
        System.out.println("\nCustom Vehicle Details:");
        vehicle2.displayDetails();
    }
}
