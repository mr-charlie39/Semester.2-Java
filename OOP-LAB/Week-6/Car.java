public class Car{
    private String model;
    private double price;

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public static void main(String[] args){
        Car car1 = new Car();
        car1.setModel("Toyota Camry");
        car1.setPrice(25000.0);
        System.out.println("Model: " + car1.getModel());
        System.out.println("Price: $" + car1.getPrice());

        Car car2 = new Car();

        car2.setModel("Honda");
        car2.setPrice(22000.0);
        System.out.println("Model: " + car2.getModel());
        System.out.println("Price: $" + car2.getPrice());
    }
}