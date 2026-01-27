import java.util.Scanner;

public class MaxInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Step 2: Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Assume first element is max
        int max = arr[0];

        // Step 4: Traverse and compare
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 5: Output
        System.out.println("Maximum element = " + max);

        sc.close();
    }
}
