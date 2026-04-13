import java.util.Scanner;
public class Program_42 {

    static int calculategrade(int score , int fee){
        if (score > 85) {
            System.out.println("Grade: A");
            System.out.println("Financial Aid: 100%");
            return fee;
        } else if (score > 70) {
            System.out.println("Grade: B");
            System.out.println("Financial Aid: 75%");
            return fee * 75 / 100;
        } else if (score > 50) {
            System.out.println("Grade: C");
            System.out.println("Financial Aid: 50%");
            return fee * 50 / 100;
        } else {
            System.out.println("Grade: D");
            System.out.println("Financial Aid: 25%");
            return fee * 25 / 100;            
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("-----------------------------");
        System.out.println("| UOG Financial Aid Portal: | ");
        System.out.println("-----------------------------");

        System.out.println("How many Students you want : ");
        int n = s.nextInt();
        s.nextLine(); 
        System.out.println("You want to add " + n + " students.");

        String[] studets_name = new String[n];

        int[] tution_fee = new int[n];
        int[] academic_score = new int[n];

        for(int i = 0 ;i < n ; i++){
            System.out.print("Enter the Name of Student " + (i+1) + " : ");
            studets_name[i] = s.nextLine();
           

            System.out.print("Enter the Tution Fee of Student " + (i+1) + " : ");
            tution_fee[i] = s.nextInt();
            s.nextLine();
            if(tution_fee[i] == 0){
                System.out.println("Tution Fee cannot be zero. Please enter a valid amount.");
                tution_fee[i] = s.nextInt();
                s.nextLine();
            }

            System.out.print("Enter the Academic Score of Student " + (i+1) + " From (1 - 100): ");
            academic_score[i] = s.nextInt();
            s.nextLine();

            if(academic_score[i] < 1 || academic_score[i] > 100){
                System.out.println("Academic Score must be between 1 and 100. Please enter a valid score.");
                academic_score[i] = s.nextInt();
            }

            int financialAid = calculategrade(academic_score[i], tution_fee[i]);
            System.out.println("Financial Aid for Student " + (i+1) + " : " + financialAid);
        }
    }
}