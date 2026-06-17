import java.util.HashSet;
import java.util.Scanner;

public class WarehouseManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Stock Array
        int[] stock = {50, 30, 20, 50, 70, 20, 90};

        int max = stock[0];
        int min = stock[0];
        int total = 0;

        // Find max, min, total
        for (int quantity : stock) {
            if (quantity > max) {
                max = quantity;
            }

            if (quantity < min) {
                min = quantity;
            }

            total += quantity;
        }

        System.out.println("Maximum Stock : " + max);
        System.out.println("Minimum Stock : " + min);
        System.out.println("Total Stock   : " + total);

        // Detect Duplicates
        System.out.println("\nDuplicate Quantities:");

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int quantity : stock) {
            if (!seen.add(quantity)) {
                duplicates.add(quantity);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            for (int duplicate : duplicates) {
                System.out.println(duplicate);
            }
        }

        // Rotate Array
        System.out.print("\nEnter k positions to rotate: ");
        int k = sc.nextInt();

        rotateArray(stock, k);

        System.out.println("Rotated Stock Array:");
        for (int item : stock) {
            System.out.print(item + " ");
        }

        // 2D Shelf Grid
        int[][] shelf = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("\n\nOriginal Shelf Grid:");
        printMatrix(shelf);

        int[][] transpose = transposeMatrix(shelf);

        System.out.println("\nTransposed Shelf Grid:");
        printMatrix(transpose);

        sc.close();
    }

    // Rotate Array Right by k Positions
    public static void rotateArray(int[] arr, int k) {

        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // Transpose Matrix
    public static int[][] transposeMatrix(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    // Print Matrix
    public static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}