import java.util.Scanner;
public class PIEDAD_ACTIVITY_III {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int[][] scores = new int[5][5];

        
        System.out.println("Enter scores:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                scores[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sum += scores[i][j];
            }
        }
        double average = (double) sum / (5 * 5);
        System.out.println("Average of all scores: " + average);
        scanner.close();
    }
}
