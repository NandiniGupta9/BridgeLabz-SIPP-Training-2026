import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int temp = number;

        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];

        temp = number;

        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        System.out.print("Reversed Number: ");

        for (int digit : digits) {
            System.out.print(digit);
        }

        input.close();
    }
}