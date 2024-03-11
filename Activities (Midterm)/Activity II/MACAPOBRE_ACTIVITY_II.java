import java.util.Scanner;

public class MACAPOBRE_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[10];

        System.out.println("Enter 10 scores:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter score " + (i + i) + ": ");
            scores[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        double average = sum / 10;

        System.out.println("Average score: " + average);
    }
}