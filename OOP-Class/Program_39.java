import java.util.Arrays;
import java.util.Scanner;

class range {
    int max_el;
    int min_el;

    public int max(int arr[]) {
        max_el = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max_el < arr[i]) {
                max_el = arr[i];
            }
        }
        return max_el;
    }

    public int min(int arr[]) {
        min_el = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min_el > arr[i]) {
                min_el = arr[i];
            }
        }
        return min_el;
    }

    public int second_max(int arr[]) {
        // Ensure max_el is calculated first
        max(arr); 
        int second_max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > second_max && arr[i] < max_el) {
                second_max = arr[i];
            }
        }
        return second_max;
    }

    public int find_element(int arr[], int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element)
                return i;
        }
        return -1;
    }
}

class sorted {
    // Implementing Bubble Sort (Nested Loops)
    public int[] ass(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) { // Use n - i - 1 to avoid OutOfBounds
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public int[] desc(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}

// ... classes sumOfAll, Even_Odd, and reverse remain as corrected in previous step ...

class sumOfAll {
    public int sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}

class Even_Odd {
    public int[] getEven(int arr[]) {
        int[] even = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) even[i] = arr[i];
        }
        return even;
    }

    public int[] getOdd(int arr[]) {
        int[] odd = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) odd[i] = arr[i];
        }
        return odd;
    }
}

class reverse {
    public int[] reverse_array(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
}

public class Program_39 extends range {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Program_39 obj = new Program_39();
        
        
        int[] arr = { 20, 56, 78, 33, 55, 22, 7, 31, 64, 23, 6, 23, 66 };

        System.out.println("Original Array:");
        for(int i = 0 ; i < arr.length; i++)

            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("Options: \n1-Max, \n2-Min, \n3-Sum, \n4-Even/Odd, \n5-Reverse, \n6-Asc, \n7-Desc, \n8-2nd Max, \n9-Search");
        System.out.print("Enter choice: ");
        int choose = s.nextInt();

        switch (choose) {
            case 1 -> System.out.println("Maximum: " + obj.max(arr));
            case 2 -> System.out.println("Minimum: " + obj.min(arr));
            case 3 -> System.out.println("Sum: " + new sumOfAll().sum(arr));
            case 4 -> {
                Even_Odd eo = new Even_Odd();
                System.out.println("Even: " + Arrays.toString(eo.getEven(arr)));
                System.out.println("Odd: " + Arrays.toString(eo.getOdd(arr)));
            }
            case 5 -> System.out.println("Reversed: " + Arrays.toString(new reverse().reverse_array(arr.clone())));
            case 6 -> System.out.println("Ascending: " + Arrays.toString(new sorted().ass(arr.clone())));
            case 7 -> System.out.println("Descending: " + Arrays.toString(new sorted().desc(arr.clone())));
            case 8 -> System.out.println("Second Max: " + obj.second_max(arr));
            case 9 -> {
                System.out.print("Element to search: ");
                int target = s.nextInt();
                System.out.println("Index: " + obj.find_element(arr, target));
            }
            default -> System.out.println("Invalid Option");
        }
        s.close();
    }
}