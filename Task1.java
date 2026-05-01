import java.util.*;

public class Task1 {
    public static double calculateAverage(ArrayList<String> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List is null or empty.");
        }

        double sum=0;
        int count=0;

        for (String item : list) {
            try {
                sum+=Integer.parseInt(item.trim());
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Skipping non-integer value: " + item);
            }
        }

        if (count == 0) {
            throw new ArithmeticException("No valid integers found in the list.");
        }

        return sum / count;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("10", "20", "abc", "30", "xyz"));

        try {
            double avg = calculateAverage(list);
            System.out.println("Average of numeric values: " + avg);
        } catch (IllegalArgumentException|ArithmeticException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}