import java.util.Scanner;

public class StudentGradeCalculator {

    public static String getGrade(double percentage) {
        if (percentage >= 90) return "A";
        else if (percentage >= 75) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 40) return "D";
        else return "F";
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int students = input.nextInt();

        double[] physics = new double[students];
        double[] chemistry = new double[students];
        double[] maths = new double[students];
        double[] percentage = new double[students];
        String[] grade = new String[students];

        for (int i = 0; i < students; i++) {
            physics[i] = input.nextDouble();
            chemistry[i] = input.nextDouble();
            maths[i] = input.nextDouble();

            percentage[i] =
                    (physics[i] + chemistry[i] + maths[i]) / 3;

            grade[i] = getGrade(percentage[i]);
        }

        for (int i = 0; i < students; i++) {
            System.out.println(
                    percentage[i] + "% Grade=" + grade[i]);
        }

        input.close();
    }
}