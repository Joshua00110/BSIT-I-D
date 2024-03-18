import java.util.Scanner;

public class MAAMBONG_ACTIVITY_III {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[5][5];

        System.out.println("Enter scores : ");

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                scores[i][j] = sc.nextInt();

            }
        }

        int sum = 0;
        for (int[] row : scores) {
            for (int score : row) {
                sum += score;
            }
        }
        double average = (double) sum / (5 * 5);
        System.out.println("The average of the scores you entered is : " + average);

    }
}
