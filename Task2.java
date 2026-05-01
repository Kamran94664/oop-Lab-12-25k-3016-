import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial: ");
        String input = sc.nextLine();

        try {
            if (input==null || input.trim().isEmpty()) {
                throw new IllegalArgumentException("Input is null or empty.");
            }

            int n = Integer.parseInt(input.trim());

            if (n<0) {
                throw new ArithmeticException("Negative numbers do not have a factorial.");
            }

            long result = 1;
            for (int i=1; i<=n; i++) {
                result *= i;
                if (result<0) {
                    throw new ArithmeticException("Integer overflow occurred.");
                }
            }

            System.out.println("Factorial of "+n+" is: "+result);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}