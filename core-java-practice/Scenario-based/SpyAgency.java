import java.util.*;

public class SpyAgency {

    // Reverse a string
    public static String reverseMessage(String msg) {
        return new StringBuilder(msg).reverse().toString();
    }

    // Check palindrome
    public static boolean isPalindrome(String msg) {
        String cleaned = msg.replaceAll("\\s+", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    // Count vowels and consonants
    public static void countVowelsAndConsonants(String msg) {
        int vowels = 0, consonants = 0;

        msg = msg.toLowerCase();

        for (char ch : msg.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // Check anagram
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        if (str1.length() != str2.length())
            return false;

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    // Find first non-repeating character
    public static char firstNonRepeatingChar(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\0'; // No non-repeating character found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Secret message
        System.out.print("Enter secret message: ");
        String message = sc.nextLine();

        System.out.println("Reversed Message: " + reverseMessage(message));

        if (isPalindrome(message))
            System.out.println("The message is a Palindrome.");
        else
            System.out.println("The message is NOT a Palindrome.");

        countVowelsAndConsonants(message);

        // Anagram check
        System.out.print("\nEnter first intercepted message: ");
        String msg1 = sc.nextLine();

        System.out.print("Enter second intercepted message: ");
        String msg2 = sc.nextLine();

        if (areAnagrams(msg1, msg2))
            System.out.println("The messages are Anagrams.");
        else
            System.out.println("The messages are NOT Anagrams.");

        // First non-repeating character
        System.out.print("\nEnter surveillance log: ");
        String log = sc.nextLine();

        char result = firstNonRepeatingChar(log);

        if (result != '\0')
            System.out.println("First Non-Repeating Character: " + result);
        else
            System.out.println("No non-repeating character found.");

        sc.close();
    }
}