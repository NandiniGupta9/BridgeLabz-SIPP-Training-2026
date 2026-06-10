import java.util.Scanner;

public class StudentGradeCalculator2D {

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

        double[][] marks = new double[students][3];
        double[] percentage = new double[students];
        String[] grade = new String[students];

        for (int i = 0; i < students; i++) {
            marks[i][0] = input.nextDouble();
            marks[i][1] = input.nextDouble();
            marks[i][2] = input.nextDouble();

            percentage[i] =
                    (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            grade[i] = getGrade(percentage[i]);
        }

        for (int i = 0; i < students; i++) {
            System.out.println(
                    percentage[i] + "% Grade=" + grade[i]);
        }

        input.close();
    }
}