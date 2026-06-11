public class LowerCaseCompare {

    public static String manualLower(String s) {
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32);
            }

            res += c;
        }
        return res;
    }

    public static void main(String[] args) {

        String s = "HELLO WORLD";

        System.out.println("Manual: " + manualLower(s));
        System.out.println("Built-in: " + s.toLowerCase());
    }
}