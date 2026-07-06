import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of scores: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        System.out.println("Enter Scores:");

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        selectionSort(scores);

        System.out.println("Sorted Scores:");

        for (int score : scores) {
            System.out.print(score + " ");
        }

        sc.close();
    }
}