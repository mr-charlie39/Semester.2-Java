import java.util.Scanner;



class grades{
    String name;
    int semester;
    int marks;
    double total = 0;

   grades(String name , int semester){
    this.name = name;
    this.semester = semester;
   }

   void Total(int  marks){
    this.total += marks;
   }

   void output(int n){
    double avg = (this.total/n);

    if(avg >= 90){
        System.out.println("Grade A");
    }else if(avg >= 80){
        System.out.println("Grade B");
    }else if(avg >= 70){
        System.out.println("Grade C");
    }else if(avg >= 60){
        System.out.println("Grade D");
    }else if(avg >= 50){
        System.out.println("Grade F");
    }else{
        System.out.println("Fail");
    }
   }
}


public class Program_32 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = s.nextLine();
        System.out.println("Enter Semester : ");
        int sem = s.nextInt();

        System.out.print("Enter total no. of Subjects : ");
        int n = s.nextInt();

        grades g = new grades(name , sem);


        for(int i = 0; i < n ; i++){
            int m = 0;
            System.out.println("Enter marks of " + (i+1) + " Student");
            m = s.nextInt();
            g.Total(m);
        }

        g.output(n);


    }
}