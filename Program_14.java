import java.util.Scanner;
public class  Program_14{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the no. of Samsung mobiles for details : ");
        int size_s = s.nextInt();
        s.nextLine();

        Samsung[] sm = new Samsung[size_s];

        for(int i = 0 ; i < size_s ; i++){
            sm[i] = new Samsung();

            System.out.print("Enter the Model of "+(i+1)+" Samsung mobile : ");
            String model = s.nextLine();
            sm[i].setModel(model);

            System.out.print("Enter the Date of Manufacturing of "+(i+1)+" Samsung mobile : ");
            String date_of_manufacture = s.nextLine();
            sm[i].setDate_manufacture(date_of_manufacture);


            System.out.print("Enter the Version of "+(i+1)+" Samsung mobile : ");
            String version = s.nextLine();
            sm[i].setVersion(version);

            System.out.print("Enter the RAM of "+(i+1)+" Samsung mobile : ");
            String ram = s.nextLine();
            sm[i].setRam(ram);

            System.out.print("Enter the Storage of "+(i+1)+" Samsung mobile : ");
            String storage = s.nextLine();
            sm[i].setStorage(storage);

            System.out.print("Enter the Price of "+(i+1)+" Samsung mobile : ");
            double price = s.nextDouble();
            s.nextLine();
            sm[i].setPrice(price);

        }

        System.out.print("Enter the no. of Apple mobiles for details : ");
        int size_a = s.nextInt();
        s.nextLine();

        Apple[] ap = new Apple[size_a];

        for(int i = 0 ; i < size_a ; i++){
            ap[i] = new Apple();

            System.out.print("Enter the Model of "+(i+1)+" Apple mobile : ");
            String model = s.nextLine();
            ap[i].setModel(model);

            System.out.print("Enter the Date of Manufacturing of "+(i+1)+" Apple mobile : " );
            String date_of_manufacture = s.nextLine();
            ap[i].setDate_manufacture(date_of_manufacture);


            System.out.print("Enter the Version of "+(i+1)+" Apple mobile : " );
            String version = s.nextLine();
            ap[i].setVersion(version);

            System.out.print("Enter the RAM of "+(i+1)+" Apple mobile : ");
            String ram = s.nextLine();
            ap[i].setRam(ram);

            System.out.print("Enter the Storage of "+(i+1)+" Apple mobile : " );
            String storage = s.nextLine();
            ap[i].setStorage(storage);

            System.out.print("Enter the Price of "+(i+1)+" Apple mobile : ");
            double price = s.nextDouble();
            s.nextLine();
            ap[i].setPrice(price);

        }

        System.out.print("Enter the no. of Vivo mobiles for details : ");
        int size_v = s.nextInt();
        s.nextLine();

        Vivo[] vi = new Vivo[size_v];

        for(int i = 0 ; i < size_v ; i++){
            vi[i] = new Vivo();

            System.out.print("Enter the Model of "+(i+1)+" Vivo mobile : ");
            String model = s.nextLine();
            vi[i].setModel(model);

            System.out.print("Enter the Date of Manufacturing of "+(i+1)+" Vivo mobile : " );
            String date_of_manufacture = s.nextLine();
            vi[i].setDate_manufacture(date_of_manufacture);


            System.out.print("Enter the Version of "+(i+1)+" Vivo mobile : " );
            String version = s.nextLine();
            vi[i].setVersion(version);

            System.out.print("Enter the RAM of "+(i+1)+" Vivo mobile : ");
            String ram = s.nextLine();
            vi[i].setRam(ram);

            System.out.print("Enter the Storage of "+(i+1)+" Vivo mobile : " );
            String storage = s.nextLine();
            vi[i].setStorage(storage);

            System.out.print("Enter the Price of "+(i+1)+" Vivo mobile : ");
            double price = s.nextDouble();
            s.nextLine();
            vi[i].setPrice(price);

        }

        System.out.println("<================ DETAILS : ==================>\n");
        System.out.println("\t\t____________");
        System.out.println("\t\t| SAMSUNG: |");
        System.out.println("\t\t____________");

        for(int i = 0 ; i < size_s ; i++){

            System.out.println("Model of " + (i+1) + " Samsung Mobile : " + sm[i].getModel());
            System.out.println("Version of " + (i+1) + " Samsung Mobile : " + sm[i].getVersion());
            System.out.println("Date of Manufacture of " + (i+1) + " Samsung Mobile : " + sm[i].getDate_manufacture());
            System.out.println("Ram of " + (i+1) + " Samsung Mobile : " + sm[i].getRam());
            System.out.println("Storage of " + (i+1) + " Samsung Mobile : " + sm[i].getStorage());
            System.out.println("Price of " + (i+1) + " Samsung Mobile : " + sm[i].getPrice());
        }

        System.out.println("\t\t__________");
        System.out.println("\t\t| APPLE: |");
        System.out.println("\t\t__________");

        for(int i = 0 ; i < size_a ; i++){

            System.out.println("Model of " + (i+1) + " Apple Mobile : " + ap[i].getModel());
            System.out.println("Version of " + (i+1) + " Apple Mobile : " + ap[i].getVersion());
            System.out.println("Date of Manufacture of " + (i+1) + " Apple Mobile : " + ap[i].getDate_manufacture());
            System.out.println("Ram of " + (i+1) + " Apple Mobile : " + ap[i].getRam());
            System.out.println("Storage of " + (i+1) + " Apple Mobile : " + ap[i].getStorage());
            System.out.println("Price of " + (i+1) + " Apple Mobile : " + ap[i].getPrice());
        }

        System.out.println("\t\t_________");
        System.out.println("\t\t| VIVO: |");
        System.out.println("\t\t_________");

        for(int i = 0 ; i < size_v ; i++){

            System.out.println("Model of " + (i+1) + " Vivo Mobile : " + vi[i].getModel());
            System.out.println("Version of " + (i+1) + " Vivo Mobile : " + vi[i].getVersion());
            System.out.println("Date of Manufacture of " + (i+1) + " Vivo Mobile : " + vi[i].getDate_manufacture());
            System.out.println("Ram of " + (i+1) + " Vivo Mobile : " + vi[i].getRam());
            System.out.println("Storage of " + (i+1) + " Vivo Mobile : " + vi[i].getStorage());
            System.out.println("Price of " + (i+1) + " Vivo Mobile : " + vi[i].getPrice());
        }

    }
}

class details {
    String model;
    String Ram;
    String Storage;
    double price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRam() {
        return Ram;
    }

    public void setRam(String ram) {
        Ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStorage() {
        return Storage;
    }

    public void setStorage(String storage) {
        Storage = storage;
    }
}

class version extends details{
    String version;
    String date_manufacture;

    public String getDate_manufacture() {
        return date_manufacture;
    }

    public void setDate_manufacture(String date_of_manufacture) {
        this.date_manufacture = date_of_manufacture;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}

class Samsung extends version{}
class Apple extends version{}
class Vivo extends version{}

