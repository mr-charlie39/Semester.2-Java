
import java.util.Scanner;
import java.util.ArrayList;
public class library_Management_System{
    public void menu(){
        System.out.println("\t\t | LIBRARY MANAGEMENT SYSTEM |");
        System.out.println("1. Add Book.");
        System.out.println("2. Add Member.");
        System.out.println("3. Issue Book.");
        System.out.println("4. Return Book.");
        System.out.println("5. Display Book.");
        System.out.println("6. Exit.");
        
    }

    public library_Management_System(){
        
    }
    
    public static void main(String[] args ){
        Scanner s = new Scanner(System.in);

        Book b = new Book();
        library_Management_System l = new library_Management_System();
        Member m = new Member();

        System.out.print("Choose the action... ");
        int n = s.nextInt();
        if(n == 1){
            l.addBook();
        }else if(l == 2){
            l.addMember();
        }else if(n == 3){
            b.issueBook();
        }else if(n == 4){
            b.returnBook();
        }else if(n == 5){
            b.displayBook();
        }else if(n == 6){
            System.out.println("GOOD BYE: ");
        }
    }
}
class Book extends library_Management_System{
    ArrayList<Integer> bookId;
    ArrayList<String> title;
    ArrayList<String> author;
    ArrayList<Double> price;
    ArrayList<Boolean> isIssued;

    public Book(ArrayList<Integer> bookId , ArrayList<String> title , ArrayList<String> author , ArrayList<Double> price ,ArrayList<Boolean> isIssued , int size ){
        for(int i = 0 ;i < size ; i++){
            this.bookId = new ArrayList<>();
            this.title = new ArrayList<>();
            this.author = new ArrayList<>();
            this.price = new ArrayList<>();
            this.isIssued = new ArrayList<>();

            this.bookId.add(bookId.get(i));
            this.title.add(title.get(i));
            this.author.add(author.get(i));
            this.price.add(price.get(i));
            this.isIssued.add(isIssued.get(i));


        }
    }


    public static void main(String[] args){

        

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of Books you want ot enter... ");
        int size = s.nextInt();

        int[] id = new int[size];
        s.nextLine();

        String[] title = new String[size];
        String[] name = new String[size];
        double[] price = new double[size];
        boolean[] status = new boolean[size];
        int[] choice = new int[size];


        Book[] b = new Book[size];
        for(int i = 0 ; i < size ;i++){
            System.out.print("Enter the \"ID\" of the Book : ");
            id[i] = s.nextInt();

            System.out.print("Enter the \"Title\" of the Book : ");
            title[i] = s.nextLine();

            System.out.print("Enter the name of \"Author\" : ");
            name[i] = s.nextLine();

            System.out.print("Enter the \"Price\" of the Book : ");
            price[i] = s.nextDouble();

            System.out.println("Enter the \"Status\" of Book : ");
            System.out.println("1. Issued");
            System.out.println("2. Not Issued ");
            System.out.print("Enter the no. of your answer... ");
            choice[i] = s.nextInt();
            boolean status;

            if(choice == 1){
                status = true;
            }else{
                status = false;
            }

            b[i] = new Book(id , title , name , price , status , size);

        }
    }




}