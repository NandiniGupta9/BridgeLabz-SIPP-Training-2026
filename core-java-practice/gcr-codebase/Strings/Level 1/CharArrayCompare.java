import java.util.Arrays;

public class CharArrayCompare {
    public static void main(String[] args) {

        String s = "hello";

        char[] manual = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            manual[i] = s.charAt(i);
        }

        char[] builtIn = s.toCharArray();

        System.out.println("Equal arrays: " + Arrays.equals(manual, builtIn));
    }
}