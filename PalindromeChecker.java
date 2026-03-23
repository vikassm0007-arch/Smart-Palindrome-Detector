import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Get user input
        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();

        // 2. Remove spaces and punctuation, convert to lowercase
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // 3. Reverse the cleaned string
        String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }

        // 4. Check if palindrome
        if (cleaned.equals(reversed)) {
            System.out.println("✅ It is a palindrome!");
        } else {
            System.out.println("❌ It is not a palindrome.");
        }

        sc.close();
    }
}