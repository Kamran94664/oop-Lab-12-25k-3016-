import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a sentence: ");
            String sentence = sc.nextLine();

            if (sentence == null || sentence.trim().isEmpty()) {
                throw new IllegalArgumentException("Input is null or empty.");
            }

            String[] words = sentence.trim().split("\\s+");

            if (words.length<2) {
                throw new IllegalArgumentException("Sentence must contain at least two words.");
            }

            System.out.println("Choose an operation:");
            System.out.println("1. Convert to uppercase");
            System.out.println("2. Reverse the sentence");
            System.out.println("3. Replace first word with last word");
            System.out.print("Enter choice (1/2/3): ");
            String choice = sc.nextLine().trim();

            String result;

            if (choice.equals("1")) {
                result = sentence.toUpperCase();
            } else if (choice.equals("2")) {
                StringBuilder sb = new StringBuilder();
                for (int i = words.length - 1; i >= 0; i--) {
                    sb.append(words[i]);
                    if (i != 0) sb.append(" ");
                }
                result = sb.toString();
            } else if (choice.equals("3")) {
                words[0] = words[words.length - 1];
                result = String.join(" ", words);
            } else {
                throw new IllegalArgumentException("Invalid choice entered.");
            }

            System.out.println("Modified sentence: " + result);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}