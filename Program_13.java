import java.util.Scanner;

public class Program_13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Mobiles you want to enter: ");
        int n = sc.nextInt();

        samsung[] s1 = new samsung[n];
        for(int i=0; i<n; i++){
            s1[i] = new samsung();
            System.out.print("Enter Brand of Mobile " + (i+1) + ": ");
            String brand = sc.next();
            s1[i].setbrand(brand);

            System.out.print("Enter Ram of Mobile " + (i+1) + ": ");
            String Ram = sc.next();
            s1[i].setRam(Ram);

            System.out.print("Enter Price of Mobile " + (i+1) + ": ");
            double price = sc.nextDouble();
            s1[i].setprice(price);

            System.out.print("Enter Operating System of Mobile " + (i+1) + ": ");
            String os = sc.next();
            s1[i].setos(os);
        }
        System.out.println("\n<============== Details of Mobiles: ===============>\n");
        for(int i=0; i<n; i++){
            System.out.println("Mobile " + (i+1) + ":");
            System.out.println("Brand: " + s1[i].getbrand());
            System.out.println("Ram: " + s1[i].getRam());
            System.out.println("Price: " + s1[i].getprice());
            System.out.println("Operating System: " + s1[i].getos());
            System.out.println();
        }
    }
}

class mobile{
    String brand;
    String Ram;
    double price;

    public String getbrand(){
        return brand;
    }
    public void setbrand(String brand){
        this.brand = brand;
    }
    public String getRam(){
        return Ram;
    }
    public void setRam(String Ram){
        this.Ram = Ram;
    }
    public double getprice(){
        return price;
    }
    public void setprice(double price){
        this.price = price;
    }
}

class android extends mobile{
    String os;

    public String getos(){
        return os;
    }
    public void setos(String os){
        this.os = os;
    }
}
class samsung extends android{
}