import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive Even");
                } else {
                    System.out.println(num + " is Positive Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println("Zero");
            }
        }

        if (numbers[0] > numbers[4]) {
            System.out.println("First element is greater than last element");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("First element is less than last element");
        } else {
            System.out.println("First and last elements are equal");
        }

        input.close();
    }
}