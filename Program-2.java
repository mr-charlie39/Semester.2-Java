import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("\t=== Input in Array ===");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        scanner.close();
        System.out.print("Array: ");
        System.out.print("[");
        for(int i = 0 ;i < size; i++){
            System.out.print(arr[i]);
            if(i < (size-1) ){
                System.out.print(",");
            }
        }
        System.out.println("]");
        
        for (int i = 0; i < size; i++) {
    for (int j = i + 1; j < size; j++) {
        if (arr[i] == arr[j]) {
            for (int k = j; k < size - 1; k++) {
                arr[k] = arr[k + 1];
            }
            size--;
            j--;
        }
    }
}

        
        System.out.println("After removing duplicate values.."); System.out.print("Array: ");
        System.out.print("[");
        for(int i = 0 ;i < size; i++){
            System.out.print(arr[i]);
            if(i < (size-1) ){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
