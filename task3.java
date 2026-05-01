import java.util.*;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            String input1= sc.nextLine();

            System.out.print("Enter second number: ");
            String input2= sc.nextLine();

            if (input1 == null || input1.trim().isEmpty() || input2 == null || input2.trim().isEmpty()) {
                throw new IllegalArgumentException("Input is null or empty.");
            }

            double num1 = Double.parseDouble(input1.trim());
            double num2 = Double.parseDouble(input2.trim());

            System.out.print("Enter operation (+, -, *, /): ");
            String op = sc.nextLine().trim();

            double result;

            if (op.equals("+")) {
                result = num1 + num2;
            } else if (op.equals("-")) {
                result = num1 - num2;
            } else if (op.equals("*")) {
                result = num1 * num2;
            } else if (op.equals("/")) {
                if (num2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero.");
                }
                result = num1 / num2;
            } else {
                throw new IllegalArgumentException("Invalid operation entered.");
            }

            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Input contains non-numeric characters.");
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}