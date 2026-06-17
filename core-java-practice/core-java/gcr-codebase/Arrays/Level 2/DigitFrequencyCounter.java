import java.util.Scanner;

public class DigitFrequencyCounter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long number = input.nextLong();

        int[] frequency = new int[10];

        while (number != 0) {
            int digit = (int)(number % 10);
            frequency[digit]++;
            number /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(
                        "Digit " + i +
                                " Frequency = " + frequency[i]);
            }
        }

        input.close();
    }
}