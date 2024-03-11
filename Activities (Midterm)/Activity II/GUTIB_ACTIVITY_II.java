import java.util.Scanner;

public class GUTIB_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[10];
        
        // Prompt for input
        System.out.println("Enter 10 scores:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
        }
        
        // Calculate average
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        double average = sum / 10;
        
        // Print results
        System.out.println("Average score: " + average);
    }
}
