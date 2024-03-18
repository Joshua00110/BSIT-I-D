import java.util.*;

public class PINO_ACTIVITY_III {
    public static void main(String args[] ) {

        Scanner in = new Scanner(System.in);
        int[][] scores = new int[5][5];

        System.out.println("Enter scores:");

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < 5; j++) {
                scores[i][j] = in.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < 5; j++) {
                sum += scores[i][j];
            }
        }
        double average = (double) sum / (5 * 5);
        System.out.println("Average of all scores: " + average);
        in.close();
    }
}