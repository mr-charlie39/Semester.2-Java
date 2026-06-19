import java.util.Scanner;
abstract class Vehicle_Rental {
    private String VehicleName;
    private double RentPerDay;

    public void setVehicleName(String VehicleName) {
        this.VehicleName = VehicleName;
    }

    public void setRentPerDay(double rentPerDay) {
        this.RentPerDay = rentPerDay;
    }

    public String getVehicleName() {
        return VehicleName;
    }

    public double getRentPerDay() {
        return RentPerDay;
    }

    public void displayInfo() {
        System.out.println("Vehicle Name: " + VehicleName);
        System.out.println("Rent Per Day: " + RentPerDay);
    }

    public abstract void calculate();
}

class car extends Vehicle_Rental {
    private String carType;
    private int numberOfDays;
    private double totalRent;

    public void setCartype(String carType) {
        this.carType = carType;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public String getCarType() {
        return carType;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    @Override
    public void calculate() {
        if(carType.equalsIgnoreCase("Sedan")) {
            this.totalRent = getRentPerDay() * getNumberOfDays() * 1.2;
        }else if(carType.equalsIgnoreCase("Toyota")) {
            this.totalRent = getRentPerDay() * getNumberOfDays() * 1.5;
        }else if(carType.equalsIgnoreCase("Honda")) {
            this.totalRent = getRentPerDay() * getNumberOfDays() * 1.3;
        } else {
            this.totalRent = getRentPerDay() * getNumberOfDays();
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Car Type: " + carType);
        System.out.println("Number of Days: " + numberOfDays);
        System.out.println("Total Rent: " + totalRent);
    }
}

class Trucks extends Vehicle_Rental {
    private String truckType;
    private int numberOfDays;
    private double totalRent;

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public String getTruckType() {
        return truckType;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    @Override
    public void calculate() {
        if(truckType.equalsIgnoreCase("Small")) {
            this.totalRent = getRentPerDay() * getNumberOfDays() * 1.1;
        }else if(truckType.equalsIgnoreCase("Medium")) {
            this.totalRent = getRentPerDay() * getNumberOfDays() * 1.3;
        }else if(truckType.equalsIgnoreCase("Large")) {
            this.totalRent = getRentPerDay() * getNumberOfDays() * 1.5;
        } else {
            this.totalRent = getRentPerDay() * getNumberOfDays();
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Truck Type: " + truckType);
        System.out.println("Number of Days: " + numberOfDays);
        System.out.println("Total Rent: " + totalRent);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        car myCar = new car();
        System.out.println("Car Rental:");
        System.out.print("Enter Vehicle Name: ");
        myCar.setVehicleName(s.nextLine());
        System.out.print("Enter Rent Per Day: ");
        myCar.setRentPerDay(s.nextDouble());
        s.nextLine(); 
        System.out.print("Enter Car Type (Sedan/Toyota/Honda): ");
        myCar.setCartype(s.nextLine());
        System.out.print("Enter Number of Days: ");
        myCar.setNumberOfDays(s.nextInt());
        s.nextLine();
        myCar.calculate();
        myCar.displayInfo();

        Trucks myTruck = new Trucks();

        System.out.println("\nTruck Rental:");
        System.out.print("Enter Vehicle Name: ");
        myTruck.setVehicleName(s.nextLine());
        s.nextLine();
        System.out.print("Enter Rent Per Day: ");
        myTruck.setRentPerDay(s.nextDouble());
        s.nextLine();
        System.out.print("Enter Truck Type (Small/Medium/Large): ");
        myTruck.setTruckType(s.nextLine());
        System.out.print("Enter Number of Days: ");
        myTruck.setNumberOfDays(s.nextInt());
        myTruck.calculate();
        myTruck.displayInfo();
        
        s.close();
    }
}