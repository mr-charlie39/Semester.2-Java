import java.util.Scanner;

public class Program_40 {

    Scanner s = new Scanner(System.in);

    public void firstMethod() {
        System.out.println("Enter the length of array : ");
        int length = s.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter the element at index " + (i + 1) + " : ");
            array[i] = s.nextInt();
        }

        System.out.println("The elements of the array are:");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }

        int dummy = array[0];
        int inc = 0;
        int division = length / 2;

        for (int i = 0; i < division; i++) {
            for (int j = 0; j < length; j++) {
                if (dummy == array[j]) {
                    inc++;
                }

            }
            if (inc >= division) {
                break;
            } else {
                dummy = array[i + 1];
                inc = 0;

            }
        }

        if (inc >= division) {
            System.out.println("\nThe majority element is : " + dummy);
        } else {
            System.out.println("\nThere is no majority element in the array.");
        }

    }

    public void secondMethod() {

        System.out.println("Enter length of array : ");
        int length = s.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter the element at index " + (i + 1) + " : ");
            array[i] = s.nextInt();
        }

        
        int count = 0;
        int cand = 0;

        for (int i = 0; i < length; i++) {
            if (count == 0) {
                cand = array[i];
            }
            if (array[i] == cand) {
                count++;
            } else {
                count--;
            }
        }

        
        count = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] == cand) {
                count++;
            }
        }

        if (count > length / 2) {
            System.out.println("The majority element is : " + cand);
        } else {
            System.out.println("No majority element found.");
        }

    }

    public static void main(String[] args) {

        Program_40 obj = new Program_40();
        obj.firstMethod();
        obj.secondMethod();

    }
}