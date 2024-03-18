import java.util.Scanner;

public class BALONGCAS_ACTIVITY_III {

    public static void main(String[] args) {
        Scanner avg = new Scanner(System.in);
        int[][] scores = new int[5][5];

        for(int i = 0; i < 5; i++) {
            System.out.println("Enter scores for student " + (i + 1) + ": ");
            for(int j = 0; j < 5; j++) {
                System.out.println("Enter score " + (j + 1) + ": ");
                scores[i][j] = avg.nextInt();
            }
        }

        int sum = 0;
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sum += scores[i][j];
            }
        }

        double average = (double) sum / (5 * 5);

        System.out.println("Average Score: " + average);


    }
}