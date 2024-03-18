import java.util.*;

public class PINO_ACTIVITY_II {
    public static void main(String args[] ) {
        Scanner in = new Scanner(System.in);
        int [] scores = new int[10];
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = in.nextInt();
            sum += scores[i];
        }

        double average = (double) sum / scores.length;
        System.out.println("Average score: " + average);
        in.close();
    }
}