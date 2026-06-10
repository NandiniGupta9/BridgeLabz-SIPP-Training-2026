import java.util.Scanner;

public class BMICalculator2D {

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int persons = input.nextInt();

        double[][] personData = new double[persons][3];
        String[] status = new String[persons];

        for (int i = 0; i < persons; i++) {

            do {
                personData[i][0] = input.nextDouble();
                personData[i][1] = input.nextDouble();
            } while (personData[i][0] <= 0 || personData[i][1] <= 0);

            personData[i][2] =
                    personData[i][0] /
                            (personData[i][1] * personData[i][1]);

            status[i] = getStatus(personData[i][2]);
        }

        for (int i = 0; i < persons; i++) {
            System.out.println(
                    "Weight=" + personData[i][0] +
                            " Height=" + personData[i][1] +
                            " BMI=" + personData[i][2] +
                            " Status=" + status[i]);
        }

        input.close();
    }
}