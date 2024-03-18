import java.util.Scanner;

public class CARREDO_ACTIVITY_III {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] scores = new int[5][5];

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter Scores " + (i + 1) + ":");
            for (int y = 0; y < scores[i].length; y++) {
                scores[i][y] = input.nextInt();
            }
        }

        double sum = 0;
        int count = 0;
        for (int x = 0; x < scores.length; x++) {
            for (int y = 0; y < scores[x].length; y++) {
                sum += scores[x][y];
                count++;
            }
        }

        double average = sum / count;
        System.out.println("Total Score Average: " + average);
    }
}