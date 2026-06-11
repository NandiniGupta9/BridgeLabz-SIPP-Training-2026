public class NumberFormatDemo {
    public static void main(String[] args) {

        try {
            int n = Integer.parseInt("abc");
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException");
        }
    }
}