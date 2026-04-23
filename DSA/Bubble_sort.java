import java.util.Scanner;

public class Bubble_sort {
    final static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter " + (i + 1) + " number : ");
            array[i] = s.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int n = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = n;
                }
            }
        }

        System.out.println("Sorted array is : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}