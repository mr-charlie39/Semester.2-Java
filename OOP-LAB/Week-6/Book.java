import java.util.Scanner;
public class Book {
    private String title;
    private double price;

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setPrice(double price){
        if(price < 0){
            System.out.println("Price cannot be negative.");
            return;
        }
        else{
        this.price = price;
        }
    }

    public double getPrice(){
        return price;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Book book = new Book();

        System.out.print("Enter the Title of the Book : ");
        String title = sc.nextLine();

        System.out.print("Enter the Price of the Book : ");
        double priceInput = sc.nextDouble();
        book.setPrice(priceInput);

        book.setTitle(title);
        System.out.println("Book Tile : " + book.getTitle());

        book.setPrice(priceInput);
        System.out.println("Book Price : " + book.getPrice());
    }


}
