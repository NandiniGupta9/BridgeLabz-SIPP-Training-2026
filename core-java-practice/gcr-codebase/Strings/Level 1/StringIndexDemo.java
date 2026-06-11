public class StringIndexDemo {
    public static void main(String[] args) {

        try {
            String s = "hello";
            System.out.println(s.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException");
        }
    }
}