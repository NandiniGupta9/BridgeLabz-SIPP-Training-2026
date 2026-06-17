import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int amarAge = sc.nextInt();
        int akbarAge = sc.nextInt();
        int anthonyAge = sc.nextInt();

        double amarHeight = sc.nextDouble();
        double akbarHeight = sc.nextDouble();
        double anthonyHeight = sc.nextDouble();

        int minAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));

        if (minAge == amarAge)
            System.out.println("Youngest: Amar");
        else if (minAge == akbarAge)
            System.out.println("Youngest: Akbar");
        else
            System.out.println("Youngest: Anthony");

        double maxHeight = Math.max(amarHeight,
                Math.max(akbarHeight, anthonyHeight));

        if (maxHeight == amarHeight)
            System.out.println("Tallest: Amar");
        else if (maxHeight == akbarHeight)
            System.out.println("Tallest: Akbar");
        else
            System.out.println("Tallest: Anthony");
    }
}