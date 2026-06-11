public class IllegalArgDemo {
    public static void main(String[] args) {

        try {
            String s = "hello";
            System.out.println(s.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException");
        }
    }
}