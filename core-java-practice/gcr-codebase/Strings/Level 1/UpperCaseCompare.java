public class UpperCaseCompare {

    public static String manualUpper(String s) {
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {
                c = (char)(c - 32);
            }

            res += c;
        }
        return res;
    }

    public static void main(String[] args) {

        String s = "hello world";

        System.out.println("Manual: " + manualUpper(s));
        System.out.println("Built-in: " + s.toUpperCase());
    }
}