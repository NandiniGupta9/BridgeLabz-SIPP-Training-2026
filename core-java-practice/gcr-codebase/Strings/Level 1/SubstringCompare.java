import java.util.Scanner;

public class SubstringCompare {

    public static String manualSubstring(String s, int start, int end) {
        String res = "";
        for (int i = start; i < end; i++) {
            res += s.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String s = sc.next();

        System.out.print("Start: ");
        int start = sc.nextInt();

        System.out.print("End: ");
        int end = sc.nextInt();

        String manual = manualSubstring(s, start, end);
        String builtIn = s.substring(start, end);

        System.out.println("Manual: " + manual);
        System.out.println("Built-in: " + builtIn);
    }
}